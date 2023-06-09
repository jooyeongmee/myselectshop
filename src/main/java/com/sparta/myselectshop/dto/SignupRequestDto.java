package com.sparta.myselectshop.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SignupRequestDto {
    private String username;
    private String password;
    private String email;
    private boolean isAdmin = false;
    private String adminToken = "";
}