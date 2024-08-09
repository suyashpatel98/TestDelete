package org.domain;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

public class Catalog {
    static ConcurrentHashMap<String, Item> items;

    private static final Catalog catalog = new Catalog();

    private Catalog() {
        this.items = new ConcurrentHashMap<>();
    }

    public static Catalog getCatalog() {
        return catalog;
    }

    public synchronized boolean canBeFulfilled(Order order) {
        List<Item> itemList = order.getItemsList();
        for (Item item : itemList) {
            if (!items.containsKey(item.id)) return false;
            else {
                int count = item.quantity;
                if (count > items.get(item.id).quantity) return false;
            }
        }
        return true;
    }
}
