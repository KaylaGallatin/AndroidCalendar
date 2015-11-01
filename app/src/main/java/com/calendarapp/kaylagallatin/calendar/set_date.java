package com.calendarapp.kaylagallatin.calendar;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

public class set_date extends AppCompatActivity {
    Button btn;
    int yearX,monthX,dayX;
    static final int Dialog_ID = 0;
    private Button cancelDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_date);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        showDialogOnButtonClick();

        cancelDate = (Button) this.findViewById(R.id.cancelDateButton);
        cancelDate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(set_date.this, add_event.class));
            }
        });

    }
    public void showDialogOnButtonClick(){
        btn = (Button)findViewById(R.id.button);

        btn.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        showDialog(Dialog_ID);
                    }
                }
        );
    }

    @Override
    protected Dialog onCreateDialog(int id){
        if(id == Dialog_ID)
            return new DatePickerDialog(this,dpickerListner,yearX,monthX,dayX);
        return null;
    }
    private DatePickerDialog.OnDateSetListener dpickerListner
            = new DatePickerDialog.OnDateSetListener(){
        @Override
        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth){
            yearX = year;
            monthX = monthOfYear;
            dayX = dayOfMonth;
            Toast.makeText(set_date.this,yearX + "/" + monthX + "/" + dayX, Toast.LENGTH_LONG).show();
        }
    };

}
