package com.example.franki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TabletLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablet_layout);
    }

    public void Next(View view ){
        Intent next = new Intent(this, RecycleView.class);
        startActivity(next);
    }

    public void Back(View view ){
        Intent back = new Intent(this, LinearLayout.class);
        startActivity(back);
    }
}