package com.example.franki;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RecycleView extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ItemAdapter itemAdapter;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);

        recyclerView = findViewById(R.id.recycleView);
        itemAdapter = new ItemAdapter(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);

        itemAdapter.setData(getData());
        recyclerView.setAdapter(itemAdapter);
        recyclerView.setLayoutManager(linearLayoutManager);
    }

    private List<Item> getData() {

        List<Item> list = new ArrayList<>();
        list.add(new Item(R.drawable.godot, "Godot"));
        list.add(new Item(R.drawable.godot2, "Godot C#"));
        list.add(new Item(R.drawable.godot, "Godot"));
        list.add(new Item(R.drawable.godot2, "Godot C#"));
        list.add(new Item(R.drawable.godot, "Godot"));
        list.add(new Item(R.drawable.godot2, "Godot C#"));
        list.add(new Item(R.drawable.godot, "Godot"));
        list.add(new Item(R.drawable.godot2, "Godot C#"));
        list.add(new Item(R.drawable.godot, "Godot"));
        list.add(new Item(R.drawable.godot2, "Godot C#"));

        return list;
    }

    /*
    }*/
}