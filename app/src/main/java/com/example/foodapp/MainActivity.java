package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button login_buttin,register_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();


        login_buttin=findViewById(R.id.login_button);
        register_button=findViewById(R.id.register_button);


        register_button.setOnClickListener(this);
        login_buttin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.register_button){
            Toast.makeText(this, "Login has been Clicked", Toast.LENGTH_SHORT).show();

            Intent loginbutn=new Intent(MainActivity.this,SingUp_activity.class);
            startActivity(loginbutn);
        }
        if(v.getId()==R.id.login_button){
            Toast.makeText(this, "Register has been Clicked", Toast.LENGTH_SHORT).show();

            Intent loginbutn=new Intent(MainActivity.this,singIn_Acitivity.class);
            startActivity(loginbutn);
        }

    }
}