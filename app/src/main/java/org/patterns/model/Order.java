package org.patterns.model;

import java.util.List;

import org.patterns.interfaces.ObligatoryItem;
import org.patterns.interfaces.OrderItem;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;

@Data
@Builder
public class Order {

    @Singular
    private List<OrderItem> items;

    public Order(List<OrderItem> dishes) {
        if (dishes == null || dishes.isEmpty()) {
            throw new IllegalArgumentException("Los pedidos no pueden estar vacios");
        }
        if (dishes.stream().noneMatch(ObligatoryItem.class::isInstance)) {
            throw new IllegalArgumentException("Los pedidos deben contener al menos un plato principal");
        }
        this.items = dishes;
    }

    public double getTotalPrice() {
        return items.stream()
                .mapToDouble(item -> item.getPrice() * item.getQuantity())
                .sum();
    }
}
