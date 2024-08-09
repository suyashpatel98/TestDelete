package org.domain;

public class Item {
    String name, id;
    int price;
    int quantity;

    public Item(String name, String id, int price, int quantity) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.quantity = quantity;
    }
}
