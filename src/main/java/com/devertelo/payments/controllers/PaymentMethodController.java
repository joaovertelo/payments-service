package com.devertelo.payments.controllers;

import com.ctrlbet.swagger.api.PaymentMethodsApi;
import com.ctrlbet.swagger.model.PaymentMethodApiRequest;
import com.ctrlbet.swagger.model.PaymentMethodApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PaymentMethodController implements PaymentMethodsApi {

    @Override public ResponseEntity<PaymentMethodApiResponse> createPaymentMethod(String userId,
                                                                                  PaymentMethodApiRequest paymentMethodApiRequest) {
        return PaymentMethodsApi.super.createPaymentMethod(userId, paymentMethodApiRequest);
    }

    @Override public ResponseEntity<List<PaymentMethodApiResponse>> getPaymentMethodsByUserId(String userId) {
        return PaymentMethodsApi.super.getPaymentMethodsByUserId(userId);
    }
}
