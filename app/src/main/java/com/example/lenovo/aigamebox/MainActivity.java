package com.example.lenovo.aigamebox;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private static int Spalsh=7000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent jj=new Intent(MainActivity.this,MainActivityy.class);
                startActivity(jj);
                finish();
            }
        },Spalsh);


    }
}
