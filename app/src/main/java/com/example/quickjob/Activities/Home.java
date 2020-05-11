package com.example.quickjob.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.quickjob.Activities.ClientSignUp;
import com.example.quickjob.Activities.HandymanSignUp;
import com.example.quickjob.R;

public class Home extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void handymansignup(View view){
        Intent intent = new Intent(this, HandymanSignUp.class);
        startActivity(intent);
    }

    public void clientsignup(View view){
        Intent intent = new Intent(this, ClientSignUp.class);
        startActivity(intent);
    }
}
