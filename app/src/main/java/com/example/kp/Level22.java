package com.example.kp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Level22 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level22);
    }
    public void Go(View v){
        Intent intent = new Intent(this,Level23.class);
        startActivity(intent);
    }
    public void End(View v){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        Toast.makeText(this, "1) 100 : 5 = 20 (раз)  2) 5 * 20 = 100 (деталей) - сделают 100 станков за 5 минут", Toast.LENGTH_SHORT).show();
    }
}