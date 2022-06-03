package com.example.kp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Level21 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level21);
    }
    public void Go(View v){
        Intent intent = new Intent(this,Level22.class);
        startActivity(intent);
    }
    public void End(View v){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        Toast.makeText(this, " она издает голос: мяу. Жаба – ква, собака – гав, корова – му, рыба – немая.", Toast.LENGTH_SHORT).show();
    }
}