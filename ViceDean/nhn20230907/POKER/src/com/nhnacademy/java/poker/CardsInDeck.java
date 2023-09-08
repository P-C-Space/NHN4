package com.nhnacademy.java.poker;


public enum CardsInDeck {
    ACE("1"),
    TWO("2"),
    Three("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9"),
    TEN("10"),
    JACK("11"),
    QUEEN("12"),
    KING("13");

    private final String cardName;
    
    CardsInDeck(String cardName){
        this.cardName = cardName;
    }

    @Override
    public String toString(){
        return this.cardName;
    }

    
}
