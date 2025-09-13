package com.wak.eatsmeet.controller;

import com.wak.eatsmeet.dto.ApiResponse;
import com.wak.eatsmeet.dto.food.FoodIdListDTO;
import com.wak.eatsmeet.dto.food.FoodsCurryDTO;
import com.wak.eatsmeet.model.food.Foods;
import com.wak.eatsmeet.model.food.FoodsCurry;
import com.wak.eatsmeet.service.CurryFoodService;
import com.wak.eatsmeet.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/curry")
public class CurryFoodController {
    @Autowired
    private CurryFoodService curryFoodService;

    //Get All Foods for a Curry
    //public List<Foodd>

    //Assign Food to Curry
    @PostMapping("/{curryId}/add-food")
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('SUB_ADMIN')")
    public ResponseEntity<?> assignFoodsToCurry(@PathVariable int curryId, @RequestBody FoodIdListDTO foodDto) {
        try {
            List<FoodsCurryDTO> response = curryFoodService.assignFoodToCurry(curryId, foodDto);
            return ResponseEntity.ok(new ApiResponse<List<FoodsCurryDTO>>("Foods assigned to curry successfully", response));
        } catch (IllegalArgumentException ex) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ApiResponse<String>(ex.getMessage(), null));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new ApiResponse<String>(e.getMessage(), null));
        }

    }

    @GetMapping("/get")
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('SUB_ADMIN')")
    public String getFoodsByCurryId(){
        System.out.println("Hello curry");
        return "Curry";
    }
}
