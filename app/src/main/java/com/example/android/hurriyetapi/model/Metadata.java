package com.example.android.hurriyetapi.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by glsmy on 18.12.2016.
 */
public class Metadata {
    @SerializedName("Title")
    @Expose
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
