package com.wak.eatsmeet.dto.food;

import com.wak.eatsmeet.model.food.enums.Times;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FoodsCurryDTO {
    private int id;
    private String foodName;
    private String curryName;
    private LocalDate date;
    private Times times;
    private String imgUrl;

}
