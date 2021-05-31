package com.example.demo;

public class Seat {
    private int id;
    private String name;
    private int state;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getState() {
        return state;
    }

    public Seat(int id, String name, int state) {
        this.id = id;
        this.name = name;
        this.state = state;
    }
}
