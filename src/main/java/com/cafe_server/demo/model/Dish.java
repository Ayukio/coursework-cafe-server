package com.cafe_server.demo.model;


import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "dish")
public class Dish {

    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String title;
    @NonNull
    private int weight;
    @NonNull
    private String description;
    @NonNull
    private int cost;
    @NonNull
    private Long fk_category_id;


    public Long getId() {
        return id;
    }

    public Dish(Long id, String title, int weight, String description, int cost, Long fk_category_id) {
        this.id = id;
        this.title = title;
        this.weight = weight;
        this.description = description;
        this.cost = cost;
        this.fk_category_id = fk_category_id;
    }

    @Override
    public String toString() {
        return "\nDish{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", weight='" + weight + '\'' +
                ", description='" + description + '\'' +
                ", cost='" + cost + '\'' +
                ", fk_category_id='" + fk_category_id + '\'' +
                '}';
    }
}
