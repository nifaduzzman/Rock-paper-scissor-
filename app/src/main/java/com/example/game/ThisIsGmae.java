package com.example.game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telecom.TelecomManager;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;


public class ThisIsGmae extends AppCompatActivity {

    private Button rock;
    private Button paper ;
    private Button   scissor;
    private ImageView image ;
    private TextView text ;
    private Button send ;
    Random random = new Random();
    private TextView win;
    private int i=11 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_this_is_gmae);
        rock = findViewById(R.id.rock);
        image = findViewById(R.id.image);
        scissor = findViewById(R.id.scissor);
        paper = findViewById(R.id.paper);
        text = findViewById(R.id.text);
        send = findViewById(R.id.send);

        win = findViewById(R.id.win);









        rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = 0;
                image.setImageResource(R.drawable.rock);
                text.setText("You selected rock");

            }
        });
        paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = 1;
                image.setImageResource(R.drawable.pa);
                text.setText("You selected paper");
            }
        });
        scissor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = 2;
                image.setImageResource(R.drawable.scissors);
                text.setText("You selected scissor");
            }
        });
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n = random.nextInt(2);
                if(i==11){
                    win.setText("please select one❗");
                }
                else {
                    if (n == i) {
                        win.setText("Draw the match");
                        // 0 = rock, 1= paper , 2=scissor
                    } else if ((i == 0 && n == 2) || (i == 1 && n == 0) || (i == 2 && n == 1)) {
                        win.setText("You win the game❗");
                    } else {
                        win.setText("You lose the game❗");
                    }
                }

            }
        });

    }
}