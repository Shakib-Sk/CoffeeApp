package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class SingUp_activity extends AppCompatActivity implements View.OnClickListener {
    public ImageView backbtn,menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);

         getSupportActionBar().hide();
        backbtn=findViewById(R.id.backbtn);
        menu=findViewById(R.id.menu);
        backbtn.setOnClickListener(this);
        menu.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.backbtn){
            Intent m= new Intent(SingUp_activity.this,MainActivity.class);
            startActivity(m);
            Toast.makeText(this, "This is backbtn", Toast.LENGTH_SHORT).show();
        }
        if(v.getId()==R.id.menu){
            Toast.makeText(this, "This is menu", Toast.LENGTH_SHORT).show();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater= getMenuInflater();
        inflater.inflate(R.menu.option_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
}