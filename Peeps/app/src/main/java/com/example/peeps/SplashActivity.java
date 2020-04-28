package com.example.peeps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.animation.Animator;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class SplashActivity extends AppCompatActivity {
Handler handler;
    private static int SPLASH_SCREEN_TIME_OUT=2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);

        handler=new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(SplashActivity.this,RegisterActivity.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN_TIME_OUT);


            /**
             new Handler().postDelayed(new Runnable() {
            @Override public void run() {
            Intent intent=new Intent(SplashActivity.this,RegisterActivity.class);
            startActivity(intent);

            finish();
            }
            },2000);
             **/
        }
}
