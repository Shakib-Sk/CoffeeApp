package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import static java.lang.Thread.currentThread;
import static java.lang.Thread.*;

public class splash_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();

        Thread t= new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    sleep(4000);
//                  Intent i = new Intent(splash_activity.this, MainActivity.class);
//                  startActivity(i);
//                  finish();


                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    Intent i = new Intent(splash_activity.this, MainActivity.class);
                    startActivity(i);
                }

            }
        });
      t.start();
    }
}