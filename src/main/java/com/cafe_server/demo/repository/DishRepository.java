package com.cafe_server.demo.repository;

import com.cafe_server.demo.model.Dish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DishRepository extends JpaRepository<Dish, Long> {
    Dish findByTitle(String title);
}
