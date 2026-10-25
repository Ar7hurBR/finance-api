package com.ar7hurBR.finance_api.dto;

import com.ar7hurBR.finance_api.entity.User;
import java.time.Instant;

public record UserResponse(Long id, String name, String email, Instant createdAt) {

    public static UserResponse from(User user) {
        return new UserResponse(user.getId(), user.getName(), user.getEmail(), user.getCreatedAt());
    }
}
