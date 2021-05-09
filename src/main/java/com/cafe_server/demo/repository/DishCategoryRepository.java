package com.cafe_server.demo.repository;

import com.cafe_server.demo.model.Dish;
import com.cafe_server.demo.model.DishCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DishCategoryRepository extends JpaRepository<DishCategory, Long> {
    DishCategory findByDishCatTitle(String dishCatTitle);

}
