package com.example.kp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Stikers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stikers);
    }
public void Yes(View v){
        Intent intent = new Intent(this, Stiker2.class);
        startActivity(intent);
}
public void No(View v) {
    Toast.makeText(this, "К сожалению для тебя сюпризов нет, поэтому просто поздравляю с окончанием прохождения игры)", Toast.LENGTH_SHORT).show();
    Intent homeIntent = new Intent(Intent.ACTION_MAIN);
    homeIntent.addCategory(Intent.CATEGORY_HOME);
    homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    startActivity(homeIntent);
}

}