
package com.nhnacademy.java.poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Player {
    private List<Card> playerDeck; // 플레이어의 덱
    private Rank playerRank; // 플에이어 메이드 랭크
    private List<Card> madeList; // 메이드가 된 덱
    private List<Card> normalList; // 아무것도 아닌 덱
    // 투페어 원페어 구별
    private Card madeCard; // 투페어일시 최상위 메이드 카드 아닐시에는 원페어의 최상위 메이드 카드
    private Card madeCard2; // 투페어일시 두번째 메이드 카드


    public Player() {
        playerDeck = new ArrayList<>();
        madeList = new ArrayList<>();
        this.playerRank = Rank.NO_PAIR;
    }

    public void drowCardPlayer(Card card) {
        playerDeck.add(card);
    }

    public List<Card> getPlayerDeck() {
        return playerDeck;
    }

    public void setRank(Rank rank) {
        this.playerRank = rank;
    }

    public Rank getPlayerRank() {
        return playerRank;
    }

    public void init() {
        this.playerDeck.clear();
        this.playerRank = Rank.NO_PAIR;
        this.madeList.clear();
    }

    public void setMadeList(List<Card> cards) {

        Collections.sort(cards);

        int size = cards.size();
        if (size != 0) {
            madeCard = cards.get(size - 1);
            if (size == 4) {
                madeCard2 = cards.get(1);
            }
        }

        madeList = cards;
    }

    public void setNormalList(List<Card> cards) {
        Collections.sort(cards,Comparator.reverseOrder()); // 정렬해서 전달 
        this.normalList = cards;
    }

    public List<Card> getMadeList() {
        return madeList;
    }

    public Card getMadeCard() {
        return madeCard;
    }

    public Card getMadeCard2() {
        return madeCard2;
    }

    public List<Card> getNormalList() {
        return normalList;
    }
}
