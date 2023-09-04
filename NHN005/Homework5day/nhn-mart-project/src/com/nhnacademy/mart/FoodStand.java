package com.nhnacademy.mart;

import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FoodStand {
    private static final Logger logger = LoggerFactory.getLogger(Food.class);

    private final ArrayList<Food> foods = new ArrayList<>();

    public void add(Food food) {
        foods.add(food);
    }

    public Food delete(String name){
        int index = -1;
        for(int i = 0;i < foods.size();i++){
            if(foods.get(i).getName().equals(name)){
                 index = i;

                 break;
            }
        }
        if(index == -1){
            logger.warn("존재 하지 않는 품목 : " + name);
            throw new IllegalArgumentException("존재하지 않는 품목입니다.");
        }

        logger.info("품목 삭제 성공 : " + name);
        return foods.remove(index);
    }

    public ArrayList<Food> getFoods() {
        return foods;
    }
}
