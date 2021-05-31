package com.example.demo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SeatAdapter extends RecyclerView.Adapter<SeatViewHolder> {

    private List<Seat> seats = new ArrayList<>();
    private OnItemClickListener<Seat> listener;

    @NonNull
    @Override
    public SeatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_seat, parent, false);
        return new SeatViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SeatViewHolder holder, int position) {
        holder.bindData(seats.get(position));
    }

    @Override
    public int getItemCount() {
        return seats.size();
    }

    public void updateData(List<Seat> list) {
        seats.clear();
        seats.addAll(list);
        notifyDataSetChanged();
    }
}
