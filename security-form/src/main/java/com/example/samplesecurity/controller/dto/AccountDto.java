package com.example.samplesecurity.controller.dto;

import lombok.Data;
import lombok.Getter;

@Data
public class AccountDto {
    private String username;
    private String email;
    private String password;
}
