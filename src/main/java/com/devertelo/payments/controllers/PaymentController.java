package com.devertelo.payments.controllers;

import com.ctrlbet.swagger.api.PaymentsApi;
import com.ctrlbet.swagger.model.PaymentApiRequest;
import com.ctrlbet.swagger.model.PaymentApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PaymentController implements PaymentsApi {
    @Override public ResponseEntity<PaymentApiResponse> createPayment(PaymentApiRequest paymentApiRequest) {
        return PaymentsApi.super.createPayment(paymentApiRequest);
    }

    @Override public ResponseEntity<List<PaymentApiResponse>> getAllPayments() {
        return PaymentsApi.super.getAllPayments();
    }
}
