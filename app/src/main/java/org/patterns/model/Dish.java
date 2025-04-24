package org.patterns.model;

import org.patterns.interfaces.OrderItem;

import lombok.Data;

@Data
public abstract class Dish implements OrderItem {

    private String name;
    private String description;
    private double price;
    private int quantity;
}
