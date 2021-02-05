package com.example.androidprototype.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Tag {

    @SerializedName("$id")
    @Expose
    private String id;

    @SerializedName("tagId")
    @Expose
    private String tagId;

    @SerializedName("tagName")
    @Expose
    private String tagName;

    @SerializedName("warning")
    @Expose
    private String warning;

    @SerializedName("recipeTags")
    @Expose
    private RecipeTagList recipeTagList;

    public Tag() {
        super();
    }

    public Tag(String id, String tagId, String tagName, String warning, RecipeTagList recipeTagList) {
        this.id = id;
        this.tagId = tagId;
        this.tagName = tagName;
        this.warning = warning;
        this.recipeTagList = recipeTagList;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId;
    }

    public String getTagId() {
        return tagId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setRecipeTags(RecipeTagList recipeTagList) {
        this.recipeTagList = recipeTagList;
    }

    public String getTagName() {
        return tagName;
    }

    public RecipeTagList getRecipeTagList() {
        return recipeTagList;
    }

    public String getWarning() {
        return warning;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public void setWarning(String warning) {
        this.warning = warning;
    }
}
