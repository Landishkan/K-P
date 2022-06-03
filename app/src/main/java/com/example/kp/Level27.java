package com.example.kp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Level27 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level27);
    }
    public void Go(View v){
        Intent intent = new Intent(this,Level28.class);
        startActivity(intent);
    }
    public void End(View v){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        Toast.makeText(this, "Одна десятая часть 400-это 40, четверть 40-это 10, а половина 10-это 5", Toast.LENGTH_SHORT).show();
    }
}