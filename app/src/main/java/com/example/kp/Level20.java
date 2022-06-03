package com.example.kp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Level20 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level20);
    }
    public void Go(View v){
        Intent intent = new Intent(this,Level21.class);
        startActivity(intent);
    }
    public void End(View v){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        Toast.makeText(this, "считаем кружочки внутри цифр", Toast.LENGTH_SHORT).show();
    }
}