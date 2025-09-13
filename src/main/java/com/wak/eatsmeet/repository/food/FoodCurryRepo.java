package com.wak.eatsmeet.repository.food;

import com.wak.eatsmeet.model.food.Curry;
import com.wak.eatsmeet.model.food.Foods;
import com.wak.eatsmeet.model.food.FoodsCurry;
import com.wak.eatsmeet.model.food.enums.Times;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface FoodCurryRepo extends JpaRepository<FoodsCurry, Integer> {
    Boolean existsByCurryAndFoodsAndDateAndTimes(Curry curry, Foods foods, LocalDate date, Times times);
}
