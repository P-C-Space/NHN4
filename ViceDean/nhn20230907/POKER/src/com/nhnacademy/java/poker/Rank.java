package com.nhnacademy.java.poker;

public enum Rank {

    NO_PAIR(1, "NOPAIR"),
    ONE_PAIR(2,"ONEPAIR"),
    TWO_PAIR(3,"TWOPAIR"),
    TRIPLE(4,"TRIPLE"),
    STRAIGHT(5,"STRAIGHT"),
    BACK_STRAIGHT(6,"BACKSTRAIGHT"),
    MOUNTAINT(7,"MOUNTAINT"),
    FLUSH(8,"FLUSH"),
    FULL_HOUSE(9,"FULLHOUSE"),
    FOUR_CARD(10,"FOURCARD"),
    STRAIGHT_FLUSH(11,"STRAIGHTFLUSH"),
    BACK_STRAIGHT_FLUSH(12,"BACKSTRAIGHTFLUSH"),
    ROYAL_FLUSH(13,"ROYALFLUSH");
    

    private final int rankCount;
    private final String rankName;

    Rank(int rankCount, String rankName){
        this.rankCount = rankCount;
        this.rankName = rankName;
    }
    public int getRankCount() {
        return rankCount;
    }
    public String getRankName() {
        return rankName;
    }
}
