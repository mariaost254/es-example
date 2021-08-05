package com.example.demo.esdocker;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private String id;
    private String name;
    private String description;
    private double price;
    private int stockAvailable;

}
