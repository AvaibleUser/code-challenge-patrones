package org.patterns.model.dish;

import org.patterns.interfaces.ObligatoryItem;
import org.patterns.model.Dish;

import lombok.Builder;

@Builder
public class MainDish extends Dish implements ObligatoryItem {

}
