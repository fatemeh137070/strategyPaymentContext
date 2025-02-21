package com.micro;

import org.springframework.stereotype.Component;

@Component("cashPayment")
public class CashPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("پرداخت مبلغ " + amount + " به صورت نقدی انجام شد.");
    }
}
