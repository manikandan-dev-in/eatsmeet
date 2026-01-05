package com.wak.eatsmeet.dto;

import com.wak.eatsmeet.model.cart.Cart;
import com.wak.eatsmeet.model.order.Orders;
import com.wak.eatsmeet.model.user.UserRole;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.Set;

public class UserResponse {
    private int id;

    private String name;

    private String email;

    private String contact;

    private String nic;

    private UserRole role;

    private Boolean active;
    private String refresh_token;
    private String img_url;
    private Cart cart;
    private Set<Orders> orders;

    public UserResponse(int id, String name, String email, String contact, String nic, UserRole role, Boolean active, String img_url, Cart cart, Set<Orders> orders) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.contact = contact;
        this.nic = nic;
        this.role = role;
        this.active = active;
        this.img_url = img_url;
        this.cart = cart;
        this.orders = orders;
    }

    public UserResponse() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Set<Orders> getOrders() {
        return orders;
    }

    public void setOrders(Set<Orders> orders) {
        this.orders = orders;
    }
}
