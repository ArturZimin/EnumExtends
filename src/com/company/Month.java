package com.company;

public enum Month {
    JANUARY("JANUARY", 31,Seasons.WINTER),
    FEBRUARY("FEBRUARY",28,Seasons.WINTER),
    MARCH("MARCH",31,Seasons.SPRING),
    APRIL("APRIL",30,Seasons.SPRING),
    May("May",31,Seasons.SPRING),
    JUNE("JUNE",30,Seasons.SUMMER),
    JULE("JULE",31,Seasons.SUMMER),
    AUGUST("AUGUST",31,Seasons.SUMMER),
    SEPTEMBER("SEPTEMBER",30,Seasons.AUTUMN),
    OCTEMBER("OCTEMBER",31,Seasons.AUTUMN),
    NOVEMBER("NOVEMBER",30,Seasons.AUTUMN),
    DECEMBER("DECEMBER",31,Seasons.AUTUMN);

    private int days;
    private Seasons seasons;
    private String month;

    Month(String month,int days,Seasons seasons){
        this.month=month;
        this.days=days;
        this.seasons=seasons;
    }
    public String getMonth(){
        return month;
    }
    public void setMonth(String month){
        this.month=month;
    }
    public int getDays(){
        return days;
    }
    public void setDaysEndSeason(int days){
        this.days=days;

    }

    public Seasons getSeasons(){
        return seasons;
    }
    public void getSeason(Seasons seasons){
        this.seasons=seasons;

    }

    @Override
    public String toString() {
        return "Month{" +
                "days=" + days +
                ", seasons=" + seasons +
                ", month='" + month + '\'' +
                '}';
    }
}
