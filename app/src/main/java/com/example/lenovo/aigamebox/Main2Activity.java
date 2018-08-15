package com.example.lenovo.aigamebox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Main2Activity extends AppCompatActivity {


    Button b_rock,b_paper,b_sissors;
    TextView tv_score;
    ImageView iv_computerchoice,iv_humanchoice;
    int humanscore,computerscore=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        b_rock=(Button)findViewById(R.id.rock);
        b_paper=(Button)findViewById(R.id.paper);
        b_sissors=(Button)findViewById(R.id.sissors);
        tv_score=(TextView)findViewById(R.id.tv_score);
        iv_humanchoice=(ImageView)findViewById(R.id.imageView);
        iv_computerchoice=(ImageView)findViewById(R.id.imageView2);



        b_rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                iv_humanchoice.setImageResource(R.drawable.rockk);
               String message= play_turn("rockk");
                Toast.makeText(Main2Activity.this,message,Toast.LENGTH_SHORT).show();
                tv_score.setText("ScoRe Human:"+ Integer.toString(humanscore) + "Computer:" +Integer.toString(computerscore));

            }
        });


        b_sissors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            iv_humanchoice.setImageResource(R.drawable.sissors);

                String message= play_turn("sissors");
                Toast.makeText(Main2Activity.this,message,Toast.LENGTH_SHORT).show();

                tv_score.setText("ScoRe Human:"+ Integer.toString(humanscore) + "Computer:" +Integer.toString(computerscore));

            }
        });
        b_paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                iv_humanchoice.setImageResource(R.drawable.paper);

                String message=  play_turn("paper");
                Toast.makeText(Main2Activity.this,message,Toast.LENGTH_SHORT).show();

                tv_score.setText("ScoRe Human:"+ Integer.toString(humanscore) + "Computer:" +Integer.toString(computerscore));
            }
        });

    }

    public String  play_turn( String player_choice) {
        String computer_choice = "";
        Random r = new Random();

        int computer_choice_number = r.nextInt(3);


        if (computer_choice_number == 1)

        {

            computer_choice = "rockk";
        } else if (computer_choice_number == 2) {


            computer_choice = "sissors";


        } else if (computer_choice_number == 3) {
            computer_choice = "paper";

        }


        if (computer_choice == "rockk") {
            iv_computerchoice.setImageResource(R.drawable.rockk);

        } else if (computer_choice == "paper") {
            iv_computerchoice.setImageResource(R.drawable.paper);

        } else if (computer_choice == "sissors") {
            iv_computerchoice.setImageResource(R.drawable.sissors);

        }



        if (computer_choice == player_choice) {

            return "Draw,Nobody WoN";
        }else

         if(player_choice=="sissors" && computer_choice=="rockk")
         {
             computerscore++;
             return "Rock Crushes SissoRs.computer wins";


         }
         else

         if(player_choice=="sissors" && computer_choice=="paper")
         {

             humanscore++;
             return "Sissors CuT paper.you wins";


         }
         else

         if(player_choice=="paper" && computer_choice=="rockk")
         {

             humanscore++;
             return "paper cover Rock .you wins";


         }

         else

         if(player_choice=="paper" && computer_choice=="sissors")
         {

             computerscore++;
             return "You loss sissors cut PaPeR....you Loss!";


         }
         else

         if(player_choice=="rockk" && computer_choice=="paper")
         {

             computerscore++;
             return "You loss paaper cover RocK....you Loss!";


         }



        else return "";


    }

}
