package com.example.jsu.lab4a_bl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class TemperatureConverter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature_converter);
    }

    public void convertTempButtonClicked(View v) {
        String f = ((EditText) findViewById(R.id.fahrenheitInput)).getText().toString();
        String c = ((EditText) findViewById(R.id.celsiusInput)).getText().toString();

        if(f.isEmpty()) {

            if(!c.isEmpty()) {
                double celsius = Double.parseDouble(c);
                double fahrenheit = ((celsius * 9/5) +32);

                ((EditText) findViewById(R.id.fahrenheitInput)).setText(String.valueOf(fahrenheit));
            }
        }

        else {
            double fahrenheit = Double.parseDouble(f);
            double celsius = ((fahrenheit - 32) * 5/9);

            ((EditText) findViewById(R.id.celsiusInput)).setText(String.valueOf(celsius));
        }
    }
}
