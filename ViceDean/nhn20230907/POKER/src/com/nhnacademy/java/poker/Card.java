package com.nhnacademy.java.poker;

public class Card implements Comparable<Card> {

    CardsInDeck cardName;
    Pattern pattern;

    Card(CardsInDeck cardName, Pattern pattern) {
        this.cardName = cardName;
        this.pattern = pattern;
    }


    public CardsInDeck getStringCardName() {
        return cardName;
    }

    public Pattern getPattern() {
        return pattern;
    }

    @Override
    public String toString() {
        return "[" + pattern.getPatternName() + "]" + cardName.getCardName();
    }

    @Override
    public int compareTo(Card card) {
        if((this.cardName.getCardRank() - card.getStringCardName().getCardRank()) == 0){
            return this.pattern.getPatternRank() - card.pattern.getPatternRank();
        }
        
        return this.cardName.getCardRank() - card.getStringCardName().getCardRank();
    }

}