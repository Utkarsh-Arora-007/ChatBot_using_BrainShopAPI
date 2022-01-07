package com.example.chatbot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class Splash_Screen extends AppCompatActivity {
    TextView appname;
    LottieAnimationView lottie;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        appname=findViewById(R.id.appname);
        lottie=findViewById(R.id.lottie_splash_screen);

        appname.animate().translationY(-1550).setDuration(2000).setStartDelay(0);
        lottie.animate().translationX(2000).setDuration(250).setStartDelay(3700);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent i= new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
                finish();

            }
        },4000);
    }
}