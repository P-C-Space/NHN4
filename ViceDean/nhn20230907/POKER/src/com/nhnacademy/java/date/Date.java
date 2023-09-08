package com.nhnacademy.java.date;

public class Date {
    private int year;
    private int month;
    private int day;
    private DaysInWeek daysInWeek;
    
    public Date(){
        this(1971,4, 28, DaysInWeek.THU);
    }

    public Date(int year,int month,int day,DaysInWeek daysInWeek){
        this.year = year;
        this.month = month;
        this.day = day;
        this.daysInWeek = daysInWeek;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public DaysInWeek getDaysInWeek() {
        return daysInWeek;
    }

    public void setDaysInWeek(DaysInWeek daysInWeek) {
        this.daysInWeek = daysInWeek;
    }

    @Override
    public String toString() {
        return "Date [year=" + year + ", month=" + month + ", day=" + day + ", daysInWeek=" + daysInWeek + "]";
    }
}
