package com.devertelo.payments.controllers;

import com.ctrlbet.swagger.api.UsersApi;
import com.ctrlbet.swagger.model.UserApiRequest;
import com.ctrlbet.swagger.model.UserApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController implements UsersApi {

    @Override public ResponseEntity<UserApiResponse> createUser(UserApiRequest userApiRequest) {
        return UsersApi.super.createUser(userApiRequest);
    }

    @Override public ResponseEntity<List<UserApiResponse>> getAllUsers(String id) {
        return UsersApi.super.getAllUsers(id);
    }

}
