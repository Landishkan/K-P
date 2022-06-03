package com.example.kp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Level31 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level31);
    }
    public void Go(View v){
        Intent intent = new Intent(this,Stikers.class);
        startActivity(intent);
    }
    public void End(View v){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        Toast.makeText(this, "если на 60 дней все озеро будет в кувшинках, то на один раньше кувшинок было вполовину меньше", Toast.LENGTH_SHORT).show();
    }
}