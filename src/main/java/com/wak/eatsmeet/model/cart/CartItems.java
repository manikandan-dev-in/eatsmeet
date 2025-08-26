package com.wak.eatsmeet.model.cart;

import com.wak.eatsmeet.model.food.enums.ItemTypes;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CartItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_item_id")
    private int id;

    private int item_id;

    @Enumerated(EnumType.STRING)
    private ItemTypes itemTypes;

    private double quantity;
    private double price;
    private Date created_date;
    private boolean selected;

    @ManyToOne
    @JoinColumn(name = "cart_id", referencedColumnName = "cart_id")
    private Cart cart;
}
