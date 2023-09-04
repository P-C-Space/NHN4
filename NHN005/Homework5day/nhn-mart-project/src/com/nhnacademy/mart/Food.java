package com.nhnacademy.mart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Food {
    private static final Logger logger = LoggerFactory.getLogger(Food.class);
    private final String name;
    private final int price;

    public Food(String name, int price){
        String regExp = "^[0-9]+$";

        if (name.matches(regExp)) { // 숫자가 들어온다면
            logger.warn("잘못된 인자 입력 \"구매품목\"이 입력되어야 합니다.");
            throw new IllegalArgumentException("잘못된 인자 입력 \"구매품목과\"이 입력되어야 합니다.");
        }
        this.name = name;
        this.price = price;
        logger.info("Food 생성 완료 : name - " + name);
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
