package com.example.myapp;

import android.app.ListActivity;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity4 extends ListActivity implements Runnable {

    Handler handler;
    private com.example.myerc.DBHelper dbHelper;
    private String TBNAME;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main4);
    }

    public MainActivity4(Context context){
        dbHelper = new com.example.myerc.DBHelper(context);
        TBNAME = com.example.myerc.DBHelper.TB_NAME;
    }

    public  void add(RateItem item){
        SQLiteDatabase db = dbHelper.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put("country",item.getCurName());
        values.put("country",item.getCurName());

        db.insert(TBNAME,null,values);
        db.close();
    }

    @Override
    public void run() {

    }
}