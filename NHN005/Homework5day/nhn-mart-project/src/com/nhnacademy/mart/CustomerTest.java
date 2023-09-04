package com.nhnacademy.mart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CustomerTest {
    @Test
    @DisplayName("Customer Constructor Test")
    void customerConstructorTest(){
        BuyList buyList = new BuyList();
        buyList.add("양파 2");
        Customer customer = new Customer(buyList);

        // buyListTest에서 인자 테스트 완료 돈 체크
        Assertions.assertEquals(20000, customer.getBuyableMoney());
    }

    @Test
    @DisplayName("Customer pickFoods Test")
    void customerPickFoodTest(){
        // 잘못된 값이 들어 갔거나 해당하는 품목이 없을경우
        // FoodStand에서 throw한다. -> 잘 픽업했는지
        BuyList buyList = new BuyList();
        buyList.add("양파 1 파 1");

        FoodStand foodStand = new FoodStand();
        foodStand.add(new Food("양파", 2000));
        foodStand.add(new Food("파",500));

        Customer customer = new Customer(buyList);
        customer.bring(new Basket());
        customer.pickFoods(foodStand);


        String [] itemNames = {"양파","파"};
        int index = 0;

        for(Food food : customer.getBasket().getFoods()){
            Assertions.assertEquals(itemNames[index++],food.getName());
        }

    }

    @Test
    @DisplayName("CustomerpayToxTest")
    void CustomerPayToxTest(){
        NhnMart mart = new NhnMart();
        mart.prepareMart();

        BuyList buyList = new BuyList();
        buyList.add("양파 2 계란 3 파 4 사과 20");

        Customer customer = new Customer(buyList);
        customer.bring(mart.provideBasket());
        customer.pickFoods(mart.getFoodStand());

        Assertions.assertThrows(IllegalArgumentException.class, () -> customer.payTox(mart.getCounter()));

    }
}