package com.devertelo.payments.domain;

import com.ctrlbet.swagger.model.UserApiRequest;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    @JmsListener(destination = "users", containerFactory = "socialMediaFactory")
    public void receive(UserApiRequest userApiRequest) {
        System.out.println("Received post 1: " + userApiRequest);
    }

}
