package org.domain;

import org.domain.payment.Payment;

import java.awt.print.Book;

public class BookingSystem {

    Catalog catalog;
    PaymentProcessor processor;
    public static BookingSystem bookingSystem = new BookingSystem();
    private BookingSystem() {
        catalog = Catalog.getCatalog();
        PaymentProcessor processor = new PaymentProcessor();
    }

    public static BookingSystem getBookingSystem() {
        return bookingSystem;
    }

    /**
     * boolean book(payment, item, quantity)
     */
    public synchronized boolean book(Payment payment, Order order) {
        /*
        1. Check if items are available - exit early if the entire order can't be fulfilled
        2. make payment return success
         */
        if (!catalog.canBeFulfilled(order)) return false;
        return processor.processPayment(payment);
    }
}
