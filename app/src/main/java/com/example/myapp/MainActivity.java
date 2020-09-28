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


    final DecimalFormat  df   = new DecimalFormat("######0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //获取控件 out
        final TextView outjob = findViewById(R.id.out);
        outjob.setText("kkk");

        //获取控件 inp
        final EditText inpjob = findViewById(R.id.inp);
        String text = inpjob.getText().toString();

        //获取控件button
        Button but = findViewById(R.id.button);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1 = inpjob.getText().toString();
                outjob.setText("Hi " + str1);
            }
        });
    }


}