package com.example.kp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Level24 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level24);
    }
    public void Go(View v){
        Intent intent = new Intent(this,Level25.class);
        startActivity(intent);
    }
    public void End(View v){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        Toast.makeText(this, " Количество букв в словах, ..., ..., три - 3, четыре - 6, пять - 4, шесть - 5, и тд", Toast.LENGTH_SHORT).show();
    }
}