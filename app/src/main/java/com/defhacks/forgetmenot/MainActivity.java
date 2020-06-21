package com.defhacks.forgetmenot;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openWater(View view) {
        Intent intent = new Intent(this, WaterIntakeActivity.class);
        startActivity(intent);
    }

    public void openHandwash(View view) {
        Intent intent = new Intent(this, HandwashActivity.class);
        startActivity(intent);
    }

    public void openWorkout(View view) {
        Intent intent = new Intent(this, WorkoutActivity.class);
        startActivity(intent);
    }

    public void openSleep(View view) {
        Intent intent = new Intent(this, SleepActivity.class);
        startActivity(intent);
    }

}
