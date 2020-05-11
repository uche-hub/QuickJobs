package com.example.quickjob.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.quickjob.R;

public class MainActivity extends AppCompatActivity {

    Animation rotateAnimation;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(MainActivity.this, Home.class);
                startActivity(i);

                finish();
            }
        }, 4000);

        imageView = findViewById(R.id.imageView);

        rotateAnimation();
    }

    private void rotateAnimation() {
        rotateAnimation = AnimationUtils.loadAnimation(this, R.anim.rotate);
        imageView.startAnimation(rotateAnimation);
    }
}
