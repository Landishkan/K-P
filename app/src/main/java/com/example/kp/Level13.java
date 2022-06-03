package com.example.kp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Level13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level13);
    }
    public void Go(View v){
        Intent intent = new Intent(this,Level14.class);
        startActivity(intent);
    }
    public void End(View v){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        Toast.makeText(this, "2 + 5 + 2 = 12\n" +
                "3 + 6 + 12 = 21 и тд", Toast.LENGTH_SHORT).show();
    }
}