package com.wak.eatsmeet.dto.cart;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartItemResponse {

    private int cartItemId;
    private String name;
    private double price;
    private double quantity;
    private double subTotal;

}


