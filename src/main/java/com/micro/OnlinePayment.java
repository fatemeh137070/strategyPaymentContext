package com.micro;

import org.springframework.stereotype.Component;

@Component("onlinePayment")
public class OnlinePayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("پرداخت مبلغ " + amount + " به صورت اینترنتی انجام شد.");
    }
}
