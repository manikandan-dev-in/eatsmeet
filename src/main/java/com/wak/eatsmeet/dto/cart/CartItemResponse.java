package com.wak.eatsmeet.dto.cart;

public class CartItemResponse {

    private int cartItemId;
    private String name;
    private double price;
    private double quantity;
    private double subTotal;

    // No-args constructor
    public CartItemResponse() {
    }

    // All-args constructor
    public CartItemResponse(int cartItemId, String name, double price, double quantity, double subTotal) {
        this.cartItemId = cartItemId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.subTotal = subTotal;
    }

    public int getCartItemId() {
        return cartItemId;
    }

    public void setCartItemId(int cartItemId) {
        this.cartItemId = cartItemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }
}