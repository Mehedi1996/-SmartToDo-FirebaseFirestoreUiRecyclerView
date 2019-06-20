package com.example.firebaseuirecyclerview;

public class Note {
    private String title;
    private String description;
    private int priority;

    public Note(){

        //Needed for Firebase
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }

    public Note(String title, String description, int priority) {
        this.title = title;
        this.description = description;
        this.priority = priority;
    }
}
