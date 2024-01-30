package com.sparta.user.dto;

import com.sparta.user.entity.User;
import lombok.Getter;

@Getter
public class UserResponseDto {
    private String username;
    private String email;

    public UserResponseDto(User user) {
        this.username = user.getUsername();
        this.email = user.getEmail();
    }
}
