package com.example.dto;

import com.example.enums.ProfileRole;
import com.example.enums.ProfileStatus;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProfileDTO {
    private String id;
    private String name;
    private String surname;
    private String phone;
    private String email;
    private String password;
    private ProfileStatus status;
    private ProfileRole role;
    private boolean visible;
    private LocalDateTime createdDate;
    private LocalDateTime birthDate;
}
