package com.ibm.spring.beans;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {
    public String getPayment() {
        return "Payment service";
    }

}
