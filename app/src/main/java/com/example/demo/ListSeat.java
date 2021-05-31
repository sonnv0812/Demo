package com.example.demo;

import java.util.List;

public class ListSeat {
    private int id;
    private List<Seat> seats;

    public int getId() {
        return id;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public ListSeat(int id, List<Seat> seats) {
        this.id = id;
        this.seats = seats;
    }
}
