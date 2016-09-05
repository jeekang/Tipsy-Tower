package com.example.jeekang.tipsytower;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SplashActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }

    public void startButton(View view) {
        Intent intent = new Intent(this, IntroActivity.class);
        startActivity(intent);
    }
    public void sendMessage(View view) {
    }
}
