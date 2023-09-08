package com.nhnacademy.java.poker;

public enum Rank {

    NOPAIR(1, "NOPAIR"),
    ONEPAIR(2,"ONEPAIR"),
    TWOPAIR(3,"TWOPAIR"),
    TRIPLE(4,"TRIPLE"),
    STRAIGHT(5,"STRAIGHT"),
    BACKSTRAIGHT(6,"BACKSTRAIGHT"),
    MOUNTAINT(7,"MOUNTAINT"),
    FLUSH(8,"FLUSH"),
    FULLHOUSE(9,"FULLHOUSE"),
    FOURCARD(10,"FOURCARD"),
    STRAIGHTFLUSH(11,"STRAIGHTFLUSH"),
    BACKSTRAIGHTFLUSH(12,"BACKSTRAIGHTFLUSH"),
    ROYALFLUSH(13,"ROYALFLUSH");
    

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
