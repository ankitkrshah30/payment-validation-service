package com.hulkhiretech.payments.controller;

import com.hulkhiretech.payments.pojo.PaymentRequest;
import com.hulkhiretech.payments.pojo.PaymentResponse;
import com.hulkhiretech.payments.service.interfaces.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
@Slf4j
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping
    public String createPayment(@RequestBody PaymentRequest paymentDetails) {
        log.info("Requested Payment Details in Controller:{}", paymentDetails);
        PaymentResponse response =paymentService.createPayment(paymentDetails);
        log.info("Payment Response in Controller:{}", response);
        return "Payment created successfully"+response;
    }
}
