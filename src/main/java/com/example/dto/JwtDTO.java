package com.example.dto;

import com.example.enums.ProfileRole;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JwtDTO {

    private String id;
    private String email;
    private ProfileRole role;


    public JwtDTO(String id) {
        this.id = id;
    }

    public JwtDTO(String id, String email, ProfileRole role) {
        this.id = id;
        this.email = email;
        this.role = role;
    }



    public JwtDTO(String id, ProfileRole profileRole) {
        this.id = id;
        this.role = role;
    }
}
