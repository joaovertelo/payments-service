package com.devertelo.payments.controllers;

import com.ctrlbet.swagger.api.UsersApi;
import com.ctrlbet.swagger.model.UserApiRequest;
import com.ctrlbet.swagger.model.UserApiResponse;
import com.ctrlbet.swagger.model.UserUpdateApiRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController implements UsersApi {

    @Override public ResponseEntity<UserApiResponse> createUser(UserApiRequest userApiRequest) {
        return UsersApi.super.createUser(userApiRequest);
    }

    @Override public ResponseEntity<Void> deleteUserById(Long id) {
        return UsersApi.super.deleteUserById(id);
    }

    @Override public ResponseEntity<List<UserApiResponse>> getAllUsers() {
        return UsersApi.super.getAllUsers();
    }

    @Override public ResponseEntity<UserApiResponse> getUserById(Long id) {
        return UsersApi.super.getUserById(id);
    }

    @Override
    public ResponseEntity<UserApiResponse> updateUserById(Long id, UserUpdateApiRequest userUpdateApiRequest) {
        return UsersApi.super.updateUserById(id, userUpdateApiRequest);
    }
}
