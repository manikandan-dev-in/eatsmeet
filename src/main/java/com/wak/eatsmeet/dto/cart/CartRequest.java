package com.wak.eatsmeet.dto.cart;

import com.wak.eatsmeet.model.food.enums.ItemTypes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartRequest {

    private int itemId;
    private ItemTypes itemType;
    private double quantity;

}