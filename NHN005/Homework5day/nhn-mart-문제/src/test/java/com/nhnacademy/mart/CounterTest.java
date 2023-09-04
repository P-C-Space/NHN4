package com.nhnacademy.mart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CounterTest {
    @Test
    @DisplayName("CounterPayTest")
    void counterPayTest(){
        Basket basket = new Basket();
        basket.add(new Food("양파",2000));
        Counter couter = new Counter();
        Assertions.assertEquals(2000,couter.pay(basket));
    }
}
