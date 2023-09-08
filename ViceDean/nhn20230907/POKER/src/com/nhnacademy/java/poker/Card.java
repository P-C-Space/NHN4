package com.nhnacademy.java.poker;

public class Card{

    CardsInDeck cardName;
    Pattern pattern;

    Card(CardsInDeck cardName,Pattern pattern){
        this.cardName = cardName;
        this.pattern = pattern;
    }

    @Override
    public String toString() {
        return "Card [cardName=" + cardName + ", pattern=" + pattern + "]";
    }

    
}