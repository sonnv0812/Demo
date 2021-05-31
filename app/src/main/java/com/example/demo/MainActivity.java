package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerCar;
    private CarAdapter carAdapter = new CarAdapter();
    private SeatAdapter seatAdapter;
    private List<ListSeat> car = new ArrayList<>();
    private List<Seat> seat = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("DEMO", "onCreate");
        recyclerCar = findViewById(R.id.recycler_main);
        seat.add(new Seat(1, "A1", 1));
        seat.add(new Seat(1, "A2", 0));
        seat.add(new Seat(1, "A3", 1));
        seat.add(new Seat(1, "A4", 0));
        seat.add(new Seat(1, "A5", 1));

        List<Seat> seatEnd = new ArrayList<>();
        seatEnd.add(new Seat(1, "A1", 1));
        seatEnd.add(new Seat(1, "A1", 1));
        seatEnd.add(new Seat(1, "A1", 1));
        seatEnd.add(new Seat(1, "A1", 1));
        seatEnd.add(new Seat(1, "A1", 1));

        car.add(new ListSeat(1, seat));
        car.add(new ListSeat(1, seat));
        car.add(new ListSeat(1, seat));
        car.add(new ListSeat(1, seat));
        car.add(new ListSeat(1, seat));
        car.add(new ListSeat(1, seat));
        car.add(new ListSeat(1, seat));
        car.add(new ListSeat(2, seatEnd));

        carAdapter.updateData(car);
        recyclerCar.setAdapter(carAdapter);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("DEMO", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("DEMO", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("DEMO", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("DEMO", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("DEMO", "onDestroy");
    }
}
