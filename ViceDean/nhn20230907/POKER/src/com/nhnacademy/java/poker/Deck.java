package com.nhnacademy.java.poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> deck;
    private int drowCount;

    public Deck() {
        init(); // 초기화
        // printDeck(); 테스트
        shuffle(); // 셔플
        // printDeck(); 테스트

    }

    private void init() {
        drowCount = 0;
        deck = new ArrayList<Card>();
        CardsInDeck[] cards = CardsInDeck.values();
        Pattern[] patterns = Pattern.values();

        for (int i = 0; i < patterns.length; i++) {
            for (int j = 0; j < cards.length; j++) {
                deck.add(new Card(cards[j], patterns[i]));
            }
        }
    }

    private void shuffle() {
        Collections.shuffle(deck);
    }

    // 확인용
    private void printDeck() {
        for (Card c : deck) {
            System.out.println(c);
        }
    }

    public Card drow() {
        return deck.remove(drowCount);
    }
}
