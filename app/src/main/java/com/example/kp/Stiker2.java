package com.example.kp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Stiker2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stiker2);
    }
    public void setonClickListener(View v) {
        startActivity(new Intent(Intent.ACTION_VIEW)
                .setData(Uri.parse("https://t.me/addstickers/princesseskan"))
        );
    }
}