package com.example.security.jwt;

import lombok.Data;

@Data
public class LoginRequest {
    private String username;
    private String password;

}
