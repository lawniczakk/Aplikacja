package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.DatePicker;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AddActivity extends AppCompatActivity {

    private static final String TAG = "AddActivity";

//    DatabaseHelper mDatabaseHelper;
//    private RadioGroup run, walk, swim, cycling;
//    private DatePicker simpleDatePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_activity);
        getSupportActionBar().setTitle("Activity");

//        run = (RadioGroup) findViewById(R.id.run);
//        swim = (RadioGroup) findViewById(R.id.swim);
//        walk = (RadioGroup) findViewById(R.id.walk);
//        cycling = (RadioGroup) findViewById(R.id.cycling);
//        simpleDatePicker = (DatePicker) findViewById(R.id.simpleDatePicker);
//        mDatabaseHelper = new DatabaseHelper(this);
//
//
//    }
//    public void AddData (String newEntry){
//        boolean insertData = mDatabaseHelper.addData(newEntry);
//
//        if(insertData) {
//            toastMassage("Data Successfully Inserted");
//        } else {
//            toastMassage("Something went wrong");
//
//        }
//
//        private void toastMassage(String massage){
//            Toast.makeText(this, message, Toast.LENGTH_SHORT). show();
//        }

    }
}

