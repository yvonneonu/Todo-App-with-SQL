package com.example.todolist;

import android.graphics.Bitmap;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "task")

public class TodoModel {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String title;
    private String description;
    private String time;
    private Bitmap image;
    private Boolean check;

    public TodoModel(String title, String description, String time, Bitmap image, Boolean check) {
        this.title = title;
        this.description = description;
        this.time = time;
        this.image = image;
        this.check = check;
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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }

    public Boolean getCheck() {
        return check;
    }

    public void setCheck(Boolean check) {
        this.check = check;
    }
}
