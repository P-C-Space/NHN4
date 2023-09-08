package com.nhnacademy.java.date;

public enum DaysInWeek {
    
    MON("Monday"),
    TUS("TuesDay"),
    WED("WednesDay"),
    THU("ThursDay"),
    FRI("FriDay"),
    SAT("SaturDay"),
    SUN("SunDay");

    public final String dayName;

    DaysInWeek(String dayName){
        this.dayName = dayName;
    }

    @Override
    public String toString(){
        return this.dayName;
    }
}
