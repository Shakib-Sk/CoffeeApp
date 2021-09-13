package com.example.foodapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class singIn_Acitivity extends AppCompatActivity implements View.OnClickListener {
  public ImageView backbtn,menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_in_acitivity);
        getSupportActionBar().hide();

        backbtn=findViewById(R.id.backbtn);
        menu=findViewById(R.id.menu);


        backbtn.setOnClickListener(this);
        menu.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.backbtn){
            Intent m= new Intent(singIn_Acitivity.this,MainActivity.class);
            startActivity(m);
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


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
          if(item.getItemId()==R.id.share){
              Toast.makeText(this, "This is Share", Toast.LENGTH_SHORT).show();
              return true;
          }
        if(item.getItemId()==R.id.setting){
            Toast.makeText(this, "This is setting", Toast.LENGTH_SHORT).show();
            return true;
        }
        if(item.getItemId()==R.id.about_us){
            Toast.makeText(this, "This is about_us", Toast.LENGTH_SHORT).show();
            return true;
        }
        if(item.getItemId()==R.id.feedback){
            Toast.makeText(this, "This is feedback", Toast.LENGTH_SHORT).show();
            return true;
        }
        if(item.getItemId()==R.id.Rate_us){
            Toast.makeText(this, "This is Rate_us", Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}