package com.example.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    TextView points ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        points = findViewById(R.id.text2);

    }
    public void but1(View v){
        int p = Integer.valueOf(points.getText().toString());
        p += 1;
        points.setText(p+"");
    }
    public void but2(View v){
        int p = Integer.valueOf(points.getText().toString());
        p += 2;
        points.setText(p+"");
    }
    public void but3(View v){
        int p = Integer.valueOf(points.getText().toString());
        p += 3;
        points.setText(p+"");
    }
    public void but4(View v){
        points.setText("0");
    }
}