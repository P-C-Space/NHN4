package com.nhnacademy.mart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FoodTest {

    @Test
    @DisplayName("FoodConstuctorTest")
    void foodConstructorTest(){
        Food food = new Food("양파", 2000);

        Assertions.assertEquals(food.getPrice(),2000);
        Assertions.assertEquals(food.getName(),"양파");
    }


    @Test
    @DisplayName("FoodConstuctorTest2")
    void foodConstructorTest2(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Food("2", 2000));
    }

}
