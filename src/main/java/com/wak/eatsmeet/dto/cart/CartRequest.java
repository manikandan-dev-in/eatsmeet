package com.wak.eatsmeet.dto.cart;

import com.wak.eatsmeet.model.food.enums.ItemTypes;

public class CartRequest {

    private int itemId;
    private int curryId;
    private ItemTypes itemType;
    private double quantity;

    // No-args constructor
    public CartRequest() {
    }

    // All-args constructor
    public CartRequest(int itemId, ItemTypes itemType, double quantity, int curry_id) {
        this.itemId = itemId;
        this.itemType = itemType;
        this.quantity = quantity;
        this.curryId = curry_id;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public ItemTypes getItemType() {
        return itemType;
    }

    public void setItemType(ItemTypes itemType) {
        this.itemType = itemType;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public int getCurryId() {
        return curryId;
    }

    public void setCurryId(int curryId) {
        this.curryId = curryId;
    }
}