package com.example.maru.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;


public class Meeting {
    private long id;
    private String name;
    private String room;
    private Date date;
    private List<String> emailsList;
    private int color;

    public Meeting(long id, String name, String room, Date date, List<String> emailsList, int color) {
        this.id = id;
        this.name = name;
        this.room = room;
        this.date = date;
        this.emailsList = emailsList;
        this.color = color;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<String> getEmailsList() {
        return emailsList;
    }

    public void setEmailsList(List<String> emailsList) {
        this.emailsList = emailsList;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
