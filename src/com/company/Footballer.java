package com.company;

public class Footballer {

    private String name;
    private int rating;

    //region Constructors
    Footballer(){
    }

    public Footballer(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }
    //endregion

    //region Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
    //endregion
}