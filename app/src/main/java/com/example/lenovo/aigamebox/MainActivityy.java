package com.example.lenovo.aigamebox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivityy extends AppCompatActivity {
Button rock,quiz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityy_main);

       rock=(Button)findViewById(R.id.button2);
        rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent open=new Intent(MainActivityy.this,Main2Activity.class);
                startActivity(open);
            }
        });

  quiz=(Button)findViewById(R.id.button);
        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent open=new Intent(MainActivityy.this,FirsTpage.class);
                startActivity(open);
            }
        });




    }
}
