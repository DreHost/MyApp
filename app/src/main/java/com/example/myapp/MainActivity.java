package com.example.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "ERC";
    EditText inp ;
    TextView out ;

    final DecimalFormat  df   = new DecimalFormat("######0.0000");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inp = findViewById(R.id.text2);
        out = findViewById(R.id.text1);

    }

    public void btn1(View v) {
        if (inp.getText().toString().length() == 0) {
            Toast.makeText(this, "Input The Amount", Toast.LENGTH_SHORT).show();
        } else {
            double F = Double.valueOf(inp.getText().toString());
            F = F * 0.1473;
            out.setText(df.format(F));
        }
    }

    public void btn2(View v) {
        if (inp.getText().toString().length() == 0) {
            Toast.makeText(this, "Input The Amount", Toast.LENGTH_SHORT).show();
        } else {
            double F = Double.valueOf(inp.getText().toString());
            F = F * 0.1252;
            out.setText(df.format(F));
        }
    }

    public void btn3(View v){
        if (inp.getText().toString().length() == 0) {
            Toast.makeText(this, "Input The Amount", Toast.LENGTH_SHORT).show();
        } else {
            double F = Double.valueOf(inp.getText().toString());
            F = F * 171.4292;
            out.setText(df.format(F));
        }
    }

    public void btn4(View v) {
        if (inp.getText().toString().length() == 0) {
            Toast.makeText(this, "Input The Amount", Toast.LENGTH_SHORT).show();
        } else {
            inp.setText("");
            out.setText(R.string.text1);
        }
    }

    public void btn5(View v){
        if (inp.getText().toString().length() == 0) {
            Toast.makeText(this, "Input The Amount", Toast.LENGTH_SHORT).show();
        } else {
            Intent config = new Intent(this, MainActivity2.class);

            double F = Double.valueOf(inp.getText().toString());
            double DR = F * 0.1473;
            double ER = F * 0.1252;
            double WR = F * 171.4292;

            config.putExtra("drk", DR);
            config.putExtra("erk", ER);
            config.putExtra("wrk", WR);

            Log.i(TAG, "openOne:dollarRate = " + DR);
            Log.i(TAG, "openOne:euroRate = " + ER);
            Log.i(TAG, "openOne:wonRate = " + WR);

            startActivity(config);
        }
    }
}