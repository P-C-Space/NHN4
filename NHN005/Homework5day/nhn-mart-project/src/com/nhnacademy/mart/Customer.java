package com.nhnacademy.mart;

class Customer {

    // 고객이 가진 돈
    private int BuyableMoney;

    public Basket getBasket() {
        return basket;
    }

    // 고객 구매 목록
    private final BuyList buyList;

    // 고객 장바구니
    private Basket basket;

    public Customer(BuyList buyList) {
        this.buyList = buyList;
        this.BuyableMoney = 20000;
    }

    // 장바구니 챙기기
    public void bring(Basket basket) {
        this.basket = basket;
    }

    public void pickFoods(FoodStand foodStand) {


        // 집고, 삭제
        for (BuyList.Item item : buyList.getItems()) {             // 구매 리스트 상품들
            for (int i = 0; i < item.getAmount(); i++) {           // 개수만큼
                basket.add(foodStand.delete(item.getName()));      // 진열대에서 삭제 후 장바구니 추가
            }
        }
    }



    public void payTox(Counter counter) {
        int payPrice = counter.pay(basket);
        if(BuyableMoney < payPrice){
            throw new IllegalArgumentException("구매 항목이 소지한 금액을 초과 하였습니다.");
        }
        System.out.println("총 가격은 " + payPrice + "원 입니다.");
        BuyableMoney -= payPrice;

        System.out.println("고객님 결제 후 잔액 : " + BuyableMoney + "원");
    }

    public int getBuyableMoney() {
        return BuyableMoney;
    }
}
