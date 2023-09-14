package com.nhnacademy.java.poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> deck;

    public Deck() {
        init();
        // printDeck(); 테스트
        shuffle();
        // printDeck(); 테스트

    }

    private void init() {
        deck = new ArrayList<Card>();

        CardNumber[] cards = CardNumber.values();
        CardPattern[] patterns = CardPattern.values();

        for (int i = 0; i < patterns.length; i++) {
            for (int j = 0; j < cards.length; j++) {
                deck.add(new Card(cards[j], patterns[i]));
            }
        }
    }

    private void shuffle() {
        Collections.shuffle(deck);
    }

    public Card draw() {
        return deck.remove(0);
    }

    // 확인용
    // private void printDeck() {
    // for (Card c : deck) {
    // System.out.println(c);
    // }
    // }

}
