package com.micro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.micro")
public class MainApplication {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(MainApplication.class);


        PaymentContext paymentContext = context.getBean(PaymentContext.class);


        paymentContext.setPaymentStrategy("cardPayment");
        paymentContext.executePayment(100000);

        paymentContext.setPaymentStrategy("cashPayment");
        paymentContext.executePayment(50000);

        paymentContext.setPaymentStrategy("onlinePayment");
        paymentContext.executePayment(200000);
    }
}
