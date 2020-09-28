package com.example.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    TextView pa;
    TextView pb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pa = findViewById(R.id.text2);
        pb = findViewById(R.id.text4);

    }
    public void btn1(View v){
        int p = Integer.valueOf(pa.getText().toString());
        p += 1;
        pa.setText(p+"");
    }
    public void btn2(View v){
        int p = Integer.valueOf(pa.getText().toString());
        p += 2;
        pa.setText(p+"");
    }
    public void btn3(View v){
        int p = Integer.valueOf(pa.getText().toString());
        p += 3;
        pa.setText(p+"");
    }
    public void btn4(View v){
        int p = Integer.valueOf(pb.getText().toString());
        p += 1;
        pb.setText(p+"");
    }
    public void btn5(View v){
        int p = Integer.valueOf(pb.getText().toString());
        p += 2;
        pb.setText(p+"");
    }
    public void btn6(View v){
        int p = Integer.valueOf(pb.getText().toString());
        p += 3;
        pb.setText(p+"");
    }
    public void btn7(View v){
        pa.setText(0+"");
        pb.setText(0+"");
    }


}