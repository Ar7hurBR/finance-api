package com.ar7hurBR.finance_api.controller;

import com.ar7hurBR.finance_api.dto.RegisterRequest;
import com.ar7hurBR.finance_api.dto.UserResponse;
import com.ar7hurBR.finance_api.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final UserService userService;

    @PostMapping("/register")
    public ResponseEntity<UserResponse> register(@Valid @RequestBody RegisterRequest request) {
        UserResponse response = UserResponse.from(userService.register(request));
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
