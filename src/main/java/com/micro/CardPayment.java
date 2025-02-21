package com.micro;

import org.springframework.stereotype.Component;

@Component("cardPayment")
public class CardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("پرداخت مبلغ " + amount + " با کارت انجام شد.");
    }
}
