package com.example.samplesecurity.domain.enums;

import lombok.AllArgsConstructor;

public enum Role {
    USER("ROLE_USER"), ADMIN("ROLE_ADMIN");

    private String value;
    Role(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }
}
