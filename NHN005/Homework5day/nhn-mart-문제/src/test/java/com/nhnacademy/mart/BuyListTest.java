package com.nhnacademy.mart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BuyListTest {

    @Test
    @DisplayName("BuyList생성 테스트")
    void BuyListConstructorTest(){
        BuyList buyList = new BuyList();
        buyList.add("양파 2");

        // 해당 리스트의 1개의 값만 넣었으니 0번째 값과 비교
        Assertions.assertEquals("양파",buyList.getItems().get(0).getName());
        Assertions.assertEquals(2,buyList.getItems().get(0).getAmount());
    }

    @Test
    @DisplayName("BuyList생성 테스트2")
    void BuyListConstructorTest2(){
        // 문자열 부분 잘못된 인자 입력
        BuyList buyList = new BuyList();
        Assertions.assertThrows(IllegalArgumentException.class, () -> buyList.add("2 2"));
    }

    @Test
    @DisplayName("BuyList생성 테스트3")
    void BuyListConstructorTest3(){
        // 숫자 부분 잘못된 인자 입력
        BuyList buyList = new BuyList();
        Assertions.assertThrows(IllegalArgumentException.class, () -> buyList.add("양파 양파"));
    }
}
