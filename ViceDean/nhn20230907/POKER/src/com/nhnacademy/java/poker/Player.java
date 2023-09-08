package com.nhnacademy.java.poker;

import java.util.ArrayList;
import java.util.List;

public class Player {
    List<Card> playerDeck;

    public Player(){
        playerDeck = new ArrayList<>();

    }

    public void drowCardPlayer(Card card){
        playerDeck.add(card); 
    }
}
