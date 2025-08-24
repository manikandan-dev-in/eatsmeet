package com.wak.eatsmeet.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Users {
    @Id
    @Column(name = "user_id")
    private int id;
    private String name;
    private String email;
    private String contact;
    private String nic;
    private String password;
    private Boolean active;
    private String refresh_token;
}
