package com.nhnacademy.mart;

import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NhnMartShell {
    private static final Logger logger = LoggerFactory.getLogger(NhnMartShell.class);
    public static void main(String[] args) {
        NhnMart mart = new NhnMart();
        mart.prepareMart();

        BuyList buyList = inputBuyListFromShell();

        // 본인이름을 각자 맞게 영어로 변경
        // 홍길동 학생
        // -> hongGilDong or gilDong
        Customer jeongwoo = new Customer(buyList);

        // 장바구니를 챙긴다.
        jeongwoo.bring(mart.provideBasket());

        // 식품을 담는다.
        jeongwoo.pickFoods(mart.getFoodStand());

        // 카운터에서 계산한다.
        jeongwoo.payTox(mart.getCounter());
    }

    private static BuyList inputBuyListFromShell() {

        Scanner scanner = new Scanner(System.in);
        BuyList buyList = new BuyList();

        System.out.print("> ");
        String list = scanner.nextLine();

        buyList.add(list);
        logger.info("구매 리스트 생성");

        scanner.close();
        return buyList;
    }
}
