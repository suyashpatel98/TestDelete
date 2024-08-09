package org.domain;

import java.util.List;

public class Order {
    List<Item> itemsList;

    public Order(List<Item> itemsList) {
        this.itemsList = itemsList;
    }

    public List<Item> getItemsList() {
        return itemsList;
    }
}
