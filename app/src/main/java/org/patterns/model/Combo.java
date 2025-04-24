package org.patterns.model;

import java.util.List;

import org.patterns.interfaces.ObligatoryItem;
import org.patterns.interfaces.OrderItem;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;

@Data
@Builder
public class Combo implements OrderItem, ObligatoryItem {

    private String name;
    private String description;
    private int quantity;

    @Singular
    private List<Dish> items;

    public double getPrice() {
        return items.stream().mapToDouble(OrderItem::getPrice).sum();
    }
}
