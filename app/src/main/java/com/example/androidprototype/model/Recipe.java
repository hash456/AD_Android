package com.example.androidprototype.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.time.LocalDateTime;

public class Recipe {

    //@SerializedName("recipeId")
    //private int id;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("description")
    @Expose
    private String description;

    /*@SerializedName("dateCreated")
    private LocalDateTime dateCreated;*/

    @SerializedName("durationInMins")
    @Expose
    private int durationInMins;

    @SerializedName("calories")
    @Expose
    private int calories;

    public Recipe() {
        super();
    }

    public Recipe(String title, String description, int durationInMins, int calories) {
        this.title = title;
        this.description = description;
        this.durationInMins = durationInMins;
        this.calories = calories;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /*public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }*/

    public int getDurationInMins() {
        return durationInMins;
    }

    public void setDurationInMins(int durationInMins) {
        this.durationInMins = durationInMins;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
}
