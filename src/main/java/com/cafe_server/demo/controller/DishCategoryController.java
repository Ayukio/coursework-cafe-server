package com.cafe_server.demo.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Optional;

import com.cafe_server.demo.model.Dish;
import com.cafe_server.demo.model.DishCategory;
import com.cafe_server.demo.repository.DishCategoryRepository;
import com.cafe_server.demo.repository.DishRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.cafe_server.demo.repository.DishCategoryRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")

public class DishCategoryController {

    //    private final Logger log = LoggerFactory.getLogger(DishController.class);
    private DishCategoryRepository dishCategoryRepository;

    @Autowired
    DishRepository dishRepository;

    public DishCategoryController(DishCategoryRepository dishCategoryRepository) {
        this.dishCategoryRepository = dishCategoryRepository;
    }

    @GetMapping("/dish-category")
    Collection<DishCategory> categories() {
        return dishCategoryRepository.findAll();
    }

    @GetMapping("/dish-category/{id}")
    ResponseEntity<?> getCategory(@PathVariable Long id) {
        Optional<DishCategory> category = dishCategoryRepository.findById(id);
        return category.map(response -> ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/dish-category")
    ResponseEntity<DishCategory> createCategory(@RequestBody DishCategory dishCategory) throws URISyntaxException {
        DishCategory result = dishCategoryRepository.save(dishCategory);
        return ResponseEntity.created(new URI("/api/group/" + result.getId()))
                .body(result);
    }

    @PutMapping("/dish-category")
    ResponseEntity<DishCategory> updateGroup(@RequestBody DishCategory dishCategory) {
        DishCategory result = dishCategoryRepository.save(dishCategory);
        return ResponseEntity.ok().body(result);
    }

    @DeleteMapping("/dish-category/{id}")
    public ResponseEntity<?> deleteCategory(@PathVariable Long id) {
        dishCategoryRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/dish-category/{id}/dish/{dishId}")
    DishCategory categorizingDish(
            @PathVariable Long id,
            @PathVariable Long dishId
    ) {
        DishCategory dishCategory = dishCategoryRepository.findById(id).get();
        Dish dish = dishRepository.findById(dishId).get();
//        dishCategory.categorizeDish(dish);
        return dishCategoryRepository.save(dishCategory);
    }
}

