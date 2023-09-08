package com.nhnacademy.java.poker;


public enum CardsInDeck {
    ACE("A",14),
    TWO("2",2),
    Three("3",3),
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

    private final String cardName;
    private final int cardRank;
    
    CardsInDeck(String cardName,int cardRank){
        this.cardName = cardName;
        this.cardRank = cardRank;
    }

    public String getCardName() {
        return cardName;
    }
    
    public int getCardRank() {
        return cardRank;
    }
}
