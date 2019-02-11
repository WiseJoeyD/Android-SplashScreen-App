package com.sqs.exampleapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        TextView helloTextBox;
        ImageView globeImage;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helloTextBox = findViewById(R.id.helloTextView);
        globeImage = findViewById(R.id.gloveImageView);

        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.mytransition);

        globeImage.startAnimation(myanim);
        helloTextBox.startAnimation(myanim);
    }
}
