package com.nhnacademy.mart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BasketTEst {
    @Test
    @DisplayName("BasketAddTest")
    void basketAddTest(){
        Basket basket = new Basket();
        basket.add(new Food("파", 500));
        Assertions.assertEquals(1,basket.getFoods().size());
    }
}
