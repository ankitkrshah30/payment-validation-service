package com.hulkhiretech.payments.pojo;

import lombok.Data;

@Data
public class PaymentRequest {

    private String amount;
    private String currency;
    private String paymentMethod;
    private String paymentType;
    private String provider;
    private String customerId;
    private String email;
    private String phone;

}
