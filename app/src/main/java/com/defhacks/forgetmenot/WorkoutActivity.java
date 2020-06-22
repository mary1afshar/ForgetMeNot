package com.defhacks.forgetmenot;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class WorkoutActivity extends AppCompatActivity {
    TextView mTimeTextView2;
    Button mPickTimeButton2;
    Context mContext2 = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);

        mTimeTextView2 = (TextView) findViewById(R.id.time_text_view2);
        mPickTimeButton2 = (Button) findViewById(R.id.pick_time_button2);

        Calendar calendar = Calendar.getInstance();

        final int hour = calendar.get(Calendar.HOUR_OF_DAY);
        final int minute = calendar.get(Calendar.MINUTE);

        mPickTimeButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(mContext2, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        mTimeTextView2.setText(String.format("%02d:%02d", hourOfDay, minute));
                    }
                },hour,minute,android.text.format.DateFormat.is24HourFormat(mContext2));
                timePickerDialog.show();
            }
        });
    }
}