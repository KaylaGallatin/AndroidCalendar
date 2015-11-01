package com.calendarapp.kaylagallatin.calendar;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

public class set_time extends AppCompatActivity {

    private Button cancelTime;
    Button btn2;
    static final int Dialog_ID2 = 0;
    int hourX,minuteX;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_time);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        showTimePickerDialog();

        cancelTime = (Button) this.findViewById(R.id.cancelTimeButton);
        cancelTime.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(set_time.this, add_event.class));
            }
        });
    }
    public void showTimePickerDialog(){
        btn2 = (Button)findViewById(R.id.button2);
        btn2.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        showDialog(Dialog_ID2);
                    }
                }
        );
    }
    @Override
    protected Dialog onCreateDialog(int id){
        if(id == Dialog_ID2)
            return new TimePickerDialog(set_time.this,yTimePickerListner,hourX,minuteX,false);
        return null;
    }
    protected TimePickerDialog.OnTimeSetListener yTimePickerListner =
            new TimePickerDialog.OnTimeSetListener(){
                @Override
                public void onTimeSet(TimePicker view,int hourOfDay,int minute){
                    hourX = hourOfDay;
                    minuteX = minute;
                    Toast.makeText(set_time.this,hourX + " : " + minuteX, Toast.LENGTH_LONG).show();
                }
            };
}
