package com.example.checkpoint.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.List;
import jakarta.persistence.*;

import java.util.List;

@Getter
@Setter
@Entity
public class EntityTest {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;
        private String name;
        private String description;
        private Double price;
        //    private Ingredient ingredient;
        private  boolean isSummerMeal;

        public EntityTest(String name, String description, Double price, boolean isSummerMeal) {
            this.name = name;
            this.description = description;
            this.price = price;
            this.isSummerMeal = isSummerMeal;
        }

    public EntityTest() {
    }
    }
