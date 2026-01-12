package com.wak.eatsmeet.dto.cart;

import java.util.List;

public class CartResponse {

    private int cartId;
    private List<CartItemResponse> items;
    private double totalAmount;

    // No-args constructor
    public CartResponse() {
    }

    // All-args constructor
    public CartResponse(int cartId, List<CartItemResponse> items, double totalAmount) {
        this.cartId = cartId;
        this.items = items;
        this.totalAmount = totalAmount;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public List<CartItemResponse> getItems() {
        return items;
    }

    public void setItems(List<CartItemResponse> items) {
        this.items = items;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}