package com.example.franki;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Next(View view ){
        Intent next = new Intent(this, LinearLayout.class);
        startActivity(next);
    }

    public void showAlertDialog (View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle("Disculpe las molestias");
        builder.setMessage("En desarrollo");
        builder.show();

    }
}