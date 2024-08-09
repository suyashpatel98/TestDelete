package org.domain;

import org.domain.payment.CreditCardPayment;
import org.domain.payment.Payment;
import org.domain.payment.PaypalPayment;

public class PaymentProcessor {
    public boolean processPayment(Payment payment) {
        if (payment instanceof CreditCardPayment) {
            return true;
        } else if (payment instanceof PaypalPayment) {
            return true;
        }
        return false;
    }
}
