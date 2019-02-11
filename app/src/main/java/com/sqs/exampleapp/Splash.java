package com.sqs.exampleapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        TextView WelcomeTextView;
        ImageView AndroidLogoImageView;
        TextView VersionTextView;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        WelcomeTextView = findViewById(R.id.welcomeTextView);
        AndroidLogoImageView = findViewById(R.id.androidImageView);
        VersionTextView = findViewById(R.id.versionTextView);

        VersionTextView.setText(BuildConfig.VERSION_NAME);

        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.mytransition);
        WelcomeTextView.startAnimation(myanim);
        AndroidLogoImageView.startAnimation(myanim);
        VersionTextView.startAnimation((myanim));

        final Intent i = new Intent(this, MainActivity.class);

        Thread timer = new Thread(){
            public void run() {
                try {
                    sleep(4000);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();

                }
                finally {
                    startActivity(i);
                    finish();

                }

            }
        };

        timer.start();
    }
}
