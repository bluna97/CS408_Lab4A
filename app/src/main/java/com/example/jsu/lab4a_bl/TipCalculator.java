package com.example.jsu.lab4a_bl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import java.text.DecimalFormat;

public class TipCalculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_calculator);
    }

    public void calculateTipButtonClicked(View v) {

        String b = ((EditText) findViewById(R.id.totalBillInput)).getText().toString();
        String t = ((EditText) findViewById(R.id.tipPercentInput)).getText().toString();
        String p = ((EditText) findViewById(R.id.peopleInput)).getText().toString();

        if(!b.isEmpty() && !t.isEmpty() && !p.isEmpty()) {
            double totalBill = Double.parseDouble(b);
            double tipPercentage = Double.parseDouble(t);
            int people = Integer.parseInt(p);
            double tip = 0;
            double individualCost = 0;

            if(people < 1) people = 1;

            tip = (totalBill * tipPercentage) / 100;
            individualCost = (totalBill + tip) / people;
            individualCost = (double)(Math.round(individualCost * 100)) / 100;

            DecimalFormat d = new DecimalFormat("#.00");

            ((TextView) findViewById(R.id.resultLabel)).setText("Approximate individual cost: $" + String.valueOf(d.format(individualCost)));

        }
    }
}
