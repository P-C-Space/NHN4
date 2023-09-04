package com.nhnacademy.mart;

public class Counter {

    public static int pay(Basket basket){
        int sum = 0;
        for(Food food : basket.getFoods()){
            sum += food.getPrice();
        }
        return sum;
    }

}
