package com.nhnacademy.java.poker;

public enum Pattern {
    
    SPA("\u2660"),
    DIA("\u25C6"),
    HEA("\u2665"),
    CLU("\u2618");

    private final String patternName;

    Pattern(String patternName){
        this.patternName = patternName;
    }

    @Override
    public String toString(){
        return this.patternName;
    }
    
}
