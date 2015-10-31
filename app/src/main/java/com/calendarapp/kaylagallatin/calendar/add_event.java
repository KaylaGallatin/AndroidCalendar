package com.calendarapp.kaylagallatin.calendar;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class add_event extends AppCompatActivity{

    private Button backToCalendar;
    private Button selectedDateButton;
    private Button selectedTimeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_event);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        selectedDateButton = (Button) this.findViewById(R.id.selectedDate);
        selectedDateButton.setText("Date: ");
        selectedDateButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(add_event.this, set_date.class));
            }
        });

        selectedTimeButton = (Button) this.findViewById(R.id.selectedTime);
        selectedTimeButton.setText("Time: ");
        selectedTimeButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(add_event.this, set_time.class));
            }
        });

        backToCalendar = (Button) this.findViewById(R.id.backToCalendar);
        backToCalendar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(add_event.this, MainActivity.class));
            }
        });
    }

}
