package com.example.myapplication;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class AddSteps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_steps);
        getSupportActionBar().setTitle("Steps");

    }

}
