package com.example.lenovo.aigamebox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Leveltwo extends AppCompatActivity {


    Button go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leveltwo);


        go=(Button)findViewById(R.id.button3);
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent my=new Intent(Leveltwo.this,Fourpage.class);
                startActivity(my);
            }
        });
    }
}
