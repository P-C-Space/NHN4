package com.nhnacademy.java.poker;


public enum CardNumber {
    ACE("A",14),
    TWO("2",2),
    THREE("3",3),
    FOUR("4",4),
    FIVE("5",5),
    SIX("6",6),
    SEVEN("7",7),
    EIGHT("8",8),
    NINE("9",9),
    TEN("10",10),
    JACK("J",11),
    QUEEN("Q",12),
    KING("K",13);

    private final String cardNumber;
    private final int cardRank;
    
    CardNumber(String cardName,int cardRank){
        this.cardNumber = cardName;
        this.cardRank = cardRank;
    }

    public String getCardNumber() {
        return cardNumber;
    }
    
    public int getCardRank() {
        return cardRank;
    }
}
