package com.micro;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class PaymentContext {

    private final Map<String, PaymentStrategy> paymentStrategies;

    public PaymentContext(Map<String, PaymentStrategy> paymentStrategies) {
        this.paymentStrategies = paymentStrategies;
    }

    public void executePayment(String strategyType, double amount) {
        PaymentStrategy paymentStrategy = paymentStrategies.get(strategyType);
        if (paymentStrategy == null) {
            throw new IllegalStateException("هیچ استراتژی پرداختی با این نام پیدا نشد.");
        }
        paymentStrategy.pay(amount);
    }
}
