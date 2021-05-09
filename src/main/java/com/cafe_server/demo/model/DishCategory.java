package com.cafe_server.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
//@RequiredArgsConstructor
@Entity
@Table(name = "categories")
public class DishCategory {

    @Id
    @GeneratedValue
    private int id;

    @NonNull
    private String dishCatTitle;

    @NonNull
    private String cookerName;

    @NonNull
    private int minCost;

    public int getId() { return id; }

    public DishCategory(int id, String dishCatTitle, String cookerName, int minCost) {
        this.id = id;
        this.dishCatTitle = dishCatTitle;
        this.cookerName = cookerName;
        this.minCost = minCost;
    }


    @Override
    public String toString() {
        return "\nDishCategory{" +
                "id=" + id +
                ", dishCatTitle='" + dishCatTitle + '\'' +
                ", cookerName='" + cookerName + '\'' +
                ", minCost=" + minCost +
                '}';
    }
}

