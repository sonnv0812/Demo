package com.example.demo;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CarViewHolder extends RecyclerView.ViewHolder {

    private RecyclerView recyclerCar;
    private List<Seat> seats = new ArrayList<>();
    private SeatAdapter adapter = new SeatAdapter();

    public CarViewHolder(@NonNull View itemView) {
        super(itemView);
        recyclerCar = itemView.findViewById(R.id.ryc_car);
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(itemView.getContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerCar.setLayoutManager(layoutManager);
    }

    public void bindData(List<Seat> listSeat) {
        seats = listSeat;
        adapter.updateData(listSeat);
        recyclerCar.setAdapter(adapter);
    }
}
