package com.example.franki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class LinearLayout extends AppCompatActivity {

    private Spinner spinner1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);

        spinner1 = (Spinner) findViewById(R.id.spinner);

        String [] opciones = {"Masculino", "Femenino"};

        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opciones);
        spinner1.setAdapter(adapter);
    }

    public void Next(View view ){
        Intent next = new Intent(this, TabletLayout.class);
        startActivity(next);
    }

    public void Back(View view ){
        Intent back = new Intent(this, MainActivity.class);
        startActivity(back);
    }
}