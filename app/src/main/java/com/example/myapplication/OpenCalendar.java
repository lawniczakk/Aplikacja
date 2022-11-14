package com.example.myapplication;
    import android.os.Bundle;
    import androidx.appcompat.app.AppCompatActivity;

    public class OpenCalendar extends AppCompatActivity {
        @Override
            protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.open_calendar);
            getSupportActionBar().setTitle("Calendar");

        }
}
