package org.example;

import org.domain.BookingSystem;
import org.domain.Item;
import org.domain.Order;
import org.domain.User;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        BookingSystem bookingSystem = BookingSystem.getBookingSystem();
        /**
         * Populate the catalog in bookingSystem
         */
        User user1 = new User.UserBuilder().setAge(1).setCity("Duiblin").build();
        User user2 = new User.UserBuilder().setName("srg").setId("isorugb").build();
        //Order order = new Order(List.of(new Item("items1"lifksdgnb)))
        if (bookingSystem.book(user1.payment, order)) {

        }else {

        }
    }
}