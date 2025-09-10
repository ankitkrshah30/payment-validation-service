package com.hulkhiretech.payments.service.impl;

import com.hulkhiretech.payments.pojo.PaymentRequest;
import com.hulkhiretech.payments.pojo.PaymentResponse;
import com.hulkhiretech.payments.service.interfaces.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class PaymentServiceImpl implements PaymentService {

    @Override
    public PaymentResponse createPayment(PaymentRequest paymentDetails) {
        log.info("Payment Details in serviceImpl:{}", paymentDetails);
        PaymentResponse paymentResponse = new PaymentResponse();
        paymentResponse.setId("123456");
        paymentResponse.setRedirectUrl("https://www.google.com"+paymentDetails.getAmount());
        log.info("Payment Response in serviceImpl:{}", paymentResponse);
        return paymentResponse;
    }
}
