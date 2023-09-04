package com.nhnacademy.mart;

import java.util.ArrayList;
import java.util.StringTokenizer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BuyList {
    private static final Logger logger = LoggerFactory.getLogger(BuyList.class);
    private final ArrayList<Item> items = new ArrayList<>();

    public void add(String addList) {
        StringTokenizer st = new StringTokenizer(addList);

        String regExp = "^[0-9]+$";

        while (st.hasMoreTokens()) { // 다음 토큰이 있다면
            String name = "";
            String amount = "";

            name = st.nextToken();
            if (name.matches(regExp)) { // 숫자가 들어온다면
                logger.warn("잘못된 인자 입력 \"구매품목\"이 입력되어야 합니다.");
                throw new IllegalArgumentException("잘못된 인자 입력 \"구매품목과\"이 입력되어야 합니다.");
            }
            amount = st.nextToken();
            if (!amount.matches(regExp)) { // 숫자가 들어오지 않는다면
                logger.warn("잘못된 인자 입력 \"금액\"이 입력되어야 합니다.");
                throw new IllegalArgumentException("잘못된 인자 입력 \"금액\"이 입력되어야 합니다.");
            }
            items.add(new Item(name, Integer.valueOf(amount)));


        }
    }

    public ArrayList<Item> getItems() {
        return items;
    }


    public static class Item {
        private final String name;
        private final int amount;

        public Item(String name, int amount) {
            this.name = name;
            this.amount = amount;
        }

        public String getName() {
            return name;
        }

        public int getAmount() {
            return amount;
        }
    }
}
