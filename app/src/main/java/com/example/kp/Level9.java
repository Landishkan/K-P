package com.example.kp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Level9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level9);
    }
    public void Go(View v){
        Intent intent = new Intent(this,Level10.class);
        startActivity(intent);
    }
    public void End(View v){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}