package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addActivity(View view) {
        Intent i = new Intent(getApplicationContext(), com.example.myapplication.AddActivity.class);
        startActivity(i);
    }

    public void openCalendar(View view) {
        Intent i = new Intent(getApplicationContext(), com.example.myapplication.OpenCalendar.class);
        startActivity(i);
    }

    public void openDiet(View view) {
        Intent i = new Intent(getApplicationContext(), com.example.myapplication.OpenDiet.class);
        startActivity(i);
    }

    public void addSteps(View view) {
        Intent i = new Intent(getApplicationContext(), com.example.myapplication.AddSteps.class);
        startActivity(i);
    }

    public void openPoints(View view) {
        Intent i = new Intent(getApplicationContext(), com.example.myapplication.OpenPoints.class);
        startActivity(i);
    }
}

