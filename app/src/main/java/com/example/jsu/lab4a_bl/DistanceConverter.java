package com.example.jsu.lab4a_bl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class DistanceConverter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distance_converter);
    }

    public void convertDistButtonClicked(View v) {
        String m = ((EditText) findViewById(R.id.milesInput)).getText().toString();
        String k = ((EditText) findViewById(R.id.kilometersInput)).getText().toString();

        if(m.isEmpty()) {

            if(!k.isEmpty()) {
                double kilometers = Double.parseDouble(k);
                double miles = kilometers / 1.609344;

                ((EditText) findViewById(R.id.milesInput)).setText(String.valueOf(miles));
            }
        }

        else {
            double miles = Double.parseDouble(m);
            double kilometers = miles * 1.609344;

            ((EditText) findViewById(R.id.kilometersInput)).setText(String.valueOf(kilometers));
        }
    }
}
