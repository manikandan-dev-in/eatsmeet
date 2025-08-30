package com.wak.eatsmeet.model.user;

import jakarta.persistence.*;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private int id;
    private String name;
    private String email;
    private String contact;
    private String address;
    private Date bod;

    @Enumerated(EnumType.STRING)
    private Roles role;

    private Boolean active;
    private String password;
    private String refresh_token;
    private String img_url;
}
