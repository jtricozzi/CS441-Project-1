package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

//John Tricozzi

public class MainActivity extends AppCompatActivity {

    TextView helloText;
    Button helloButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Setting up the app and establishing the text and button
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helloText = (TextView) findViewById(R.id.hello_text);
        helloButton = (Button) findViewById(R.id.hello_button);



    }

    public void onHelloClick(View view){
        //Setting up what happens when the button is pressed
        //I followed this tutorial https://www.youtube.com/watch?v=9oj4f8721LM&ab_channel=John%27sAndroidStudioTutorials to get the sounds working

        final MediaPlayer mySound = MediaPlayer.create(this, R.raw.game_over);
        final Animation animShake = AnimationUtils.loadAnimation(this, R.anim.shake);

        helloButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mySound.start();
                helloButton.startAnimation(animShake);
                helloText.setTextColor(Color.RED);
            }
        });

        helloText.setTextSize(64);
        helloText.setText("Game Over");


    }
}