package com.nhnacademy.mart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FoodStandTest {
    @Test
    @DisplayName("FoodStand add Test")
    void foodStandAddTest(){
        FoodStand foodStand = new FoodStand();
        foodStand.add(new Food("양파", 2000));

        Assertions.assertEquals("양파",foodStand.getFoods().get(0).getName());
        Assertions.assertEquals(2000,foodStand.getFoods().get(0).getPrice());
    }

    @Test
    @DisplayName("FoodStand delete Test")
    void foodStandDeleteTest(){
        FoodStand foodStand = new FoodStand();
        foodStand.add(new Food("양파",2000));
        foodStand.delete("양파");

        Assertions.assertEquals(0,foodStand.getFoods().size());
    }

    @Test
    @DisplayName("FoodStand delete Test2")
    void foodStandDeleteTest2(){
        FoodStand foodStand = new FoodStand();
        Assertions.assertThrows(IllegalArgumentException.class, () -> foodStand.delete("양파"));
    }
}
