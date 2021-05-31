package com.example.demo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CarAdapter extends RecyclerView.Adapter<CarViewHolder> {

    private List<ListSeat> cars = new ArrayList<>();

    @NonNull
    @Override
    public CarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_car, parent, false);
        return new CarViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CarViewHolder holder, int position) {
        holder.bindData(cars.get(position).getSeats());
    }

    @Override
    public int getItemCount() {
        return cars.size();
    }

    public void updateData(List<ListSeat> listSeats) {
        cars.clear();
        cars.addAll(listSeats);
        notifyDataSetChanged();
    }
}
