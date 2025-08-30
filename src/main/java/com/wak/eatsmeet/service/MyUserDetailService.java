package com.wak.eatsmeet.service;

import com.wak.eatsmeet.model.user.Users;
import com.wak.eatsmeet.repository.user.EmployeeRepo;
import com.wak.eatsmeet.repository.user.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public UserDetails loadUserByUsername(String loginInput) throws UsernameNotFoundException {
        System.out.println("login: "+ loginInput);
        Users users = null;

        if(loginInput.contains("@")){
            users = userRepo.findByEmail(loginInput);
            System.out.println("1");
            if(users == null){
                System.out.println("2");
                users = employeeRepo.findByEmail(loginInput);
            }
        }
        else{
            System.out.println("ttt");
            users = userRepo.findByContact(loginInput);
            if(users == null){
                users = employeeRepo.findByContact(loginInput);
            }
        }

        System.out.println("t3");
        if (users == null) {
            System.out.println("t4");
            throw new UsernameNotFoundException("User not found with: " + loginInput);
        }

        System.out.println("t5"+ users.getEmail() );
        return User.builder()
                .username(users.getEmail() != null ? users.getEmail() : users.getContact())
                .password(users.getPassword())
                .roles(String.valueOf(users.getRole()))
                .build();
    }
}
