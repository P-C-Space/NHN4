package com.nhnacademy.java.poker;

public class Card implements Comparable<Card> {

    private CardNumber number;
    private CardPattern pattern;

    public Card(CardNumber number, CardPattern pattern) {
        this.number = number;
        this.pattern = pattern;
    }

    // getter
    public CardNumber getNumber() {
        return number;
    }

    public CardPattern getPattern() {
        return pattern;
    }

    
    @Override
    public String toString() {
        return "[" + this.getPattern().getPatternName() + "]" + this.getNumber().getCardNumber();
    }

    @Override
    public int compareTo(Card card) {
        if((this.getNumber().getCardRank() - card.getNumber().getCardRank()) == 0){
            return this.getPattern().getPatternRank() - card.getPattern().getPatternRank();
        }
        
        return this.getNumber().getCardRank() - card.getNumber().getCardRank();
    }

}