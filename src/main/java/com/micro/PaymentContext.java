package com.micro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class PaymentContext {

    private final ApplicationContext applicationContext;
    private PaymentStrategy paymentStrategy;

    @Autowired
    public PaymentContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    public void setPaymentStrategy(String strategy) {
        this.paymentStrategy = (PaymentStrategy) applicationContext.getBean(strategy);
    }

    public void executePayment(double amount) {
        if (paymentStrategy == null) {
            throw new IllegalStateException("هیچ استراتژی پرداختی انتخاب نشده است.");
        }
        paymentStrategy.pay(amount);
    }
}
