package com.example.lenovo.aigamebox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class SecondPage extends AppCompatActivity {

    RadioButton btn1,btn2;

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);


        btn=(Button)findViewById(R.id.F_btn);
        btn1=(RadioButton)findViewById(R.id.radioButton);
        btn2=(RadioButton)findViewById(R.id.radioButton2);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (btn1.isChecked())
                {
                    Intent open=new Intent(SecondPage.this,ThirdPage.class);
                    startActivity(open);

                }
                else if(btn2.isChecked()) {
                    Intent open = new Intent(SecondPage.this, Gameover.class);
                    startActivity(open);


                }
            }
        });


    }
}
