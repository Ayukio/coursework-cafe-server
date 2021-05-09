package com.cafe_server.demo.controller;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Optional;

import com.cafe_server.demo.model.Dish;
import com.cafe_server.demo.model.DishCategory;
import com.cafe_server.demo.repository.DishCategoryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.cafe_server.demo.repository.DishRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")

public class DishController {

//    private final Logger log = LoggerFactory.getLogger(DishController.class);
    private DishRepository dishRepository;

    @Autowired
    DishCategoryRepository dishCategoryRepository;

    public DishController(DishRepository dishRepository) {
        this.dishRepository = dishRepository;
    }

    @GetMapping("/dish")
    Collection<Dish> orders() {
        return dishRepository.findAll();
    }

    @GetMapping("/dish/{id}")
    ResponseEntity<?> getOrder(@PathVariable Long id) {
        Optional<Dish> order = dishRepository.findById(id);
        return order.map(response -> ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/dish")
    ResponseEntity<Dish> createOrder(@RequestBody Dish dish) throws URISyntaxException {
        Dish result = dishRepository.save(dish);
        return ResponseEntity.created(new URI("/api/group/" + result.getId()))
                .body(result);
    }

    @PutMapping("/dish")
    ResponseEntity<Dish> updateGroup(@RequestBody Dish dish) {
        Dish result = dishRepository.save(dish);
        return ResponseEntity.ok().body(result);
    }

    @DeleteMapping("/dish/{id}")
    public ResponseEntity<?> deleteOrder(@PathVariable Long id) {
        dishRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}/category/{categoryId}")
    Dish assignCategoryToDish(
            @PathVariable Long id,
            @PathVariable Long categoryId
    ) {
        Dish dish = dishRepository.findById(id).get();
        DishCategory dishCategory = dishCategoryRepository.findById(categoryId).get();
//        dish.assignCategory(dishCategory);
        return dishRepository.save(dish);
    }
}
