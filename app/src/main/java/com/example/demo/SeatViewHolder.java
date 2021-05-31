package com.example.demo;

import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SeatViewHolder extends RecyclerView.ViewHolder {

    private Seat item;
    private Button buttonNameSeat;

    public SeatViewHolder(@NonNull View itemView) {
        super(itemView);

        buttonNameSeat = itemView.findViewById(R.id.button_seat);

    }

    public void bindData(Seat object) {
        item = object;
        if (item.getState() == 0) {
            buttonNameSeat.setVisibility(View.INVISIBLE);
        } else {
            buttonNameSeat.setText(object.getName());
        }
    }
}
