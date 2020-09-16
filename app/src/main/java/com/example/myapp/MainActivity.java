package com.example.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    //add something....

    EditText inpjob ;
    TextView outjob ;

    final DecimalFormat  df   = new DecimalFormat("######0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inpjob = findViewById(R.id.inp);
        outjob = findViewById(R.id.out);

    }

    public void btn1(View v){
        double F = Double.valueOf(inpjob.getText().toString());
        double C = ( F - 32 ) / 1.8;
        outjob.setText(df.format(C));
    }

    public void btn2(View v){
        double C = Double.valueOf(inpjob.getText().toString());
        double F = C * 1.8 + 32;
        outjob.setText(df.format(F));
    }

    public void btn3(View v){
        inpjob.setText("");
        outjob.setText("");
    }
}