package com.micro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.micro")
public class MainApplication {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(MainApplication.class);

        PaymentContext paymentContext = context.getBean(PaymentContext.class);

        paymentContext.executePayment("cardPayment", 100000);
        paymentContext.executePayment("cashPayment", 50000);
        paymentContext.executePayment("onlinePayment", 200000);
    }
}
