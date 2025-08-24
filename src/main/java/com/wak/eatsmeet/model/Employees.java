package com.wak.eatsmeet.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Employees {
    @Id
    @Column(name = "emp_id")
    private int id;
    private String name;
    private String email;
    private String contact;
    private String address;
    private Date bod;
    private Roles roles;
    private Boolean active;
    private String password;
    private String refresh_token;
}
