package com.nhnacademy.java.poker;

public enum CardPattern {
    
    SPA("\u2660",4),
    DIA("\u25C6",3),
    HEA("\u2665",2),
    CLU("\u2618",1);

    private final int patternRank;
    private final String patternName;

    CardPattern(String patternName,int patternRank){
        this.patternName = patternName;
        this.patternRank = patternRank;
    }

    public String getPatternName() {
        return patternName;
    }

    public int getPatternRank() {
        return patternRank;
    }
    
}
