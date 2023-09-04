package com.nhnacademy.mart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NhnMartTest {

    @Test
    @DisplayName("NHNMart 생성 테스트")
    void NHNMartConstructorTest(){
        NhnMart nhnMart = new NhnMart();
        // 기본 생성 37개
        nhnMart.prepareMart();
        Assertions.assertEquals(37,nhnMart.getFoodStand().getFoods().size());
    }

}