package com.example.listadapter.models;

public class Movie {

    String MovieName;
    String Rating;
    String Description;


    public Movie(String movieName, String rating, String description)
    {
        this.MovieName = movieName;
        this.Rating = rating;
        this.Description = description;
    }

    public String getMovieName() {
        return MovieName;
    }

    public void setMovieName(String movieName) {
        MovieName = movieName;
    }

    public String getRating() {
        return Rating;
    }

    public void setRating(String rating) {
        Rating = rating;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }


}
