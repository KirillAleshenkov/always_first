package com.example.xakatoh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class w extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_w);
    }
    public void onClick(View view){
        Intent intent = new Intent(this,RStudent.class);
        startActivity(intent);
    }
    public void onClick1(View view){
        Intent intent = new Intent(this,DStudent.class);
        startActivity(intent);
    }
    public void onClick2(View view){
        Intent intent = new Intent(this,RedStudent.class);
        startActivity(intent);
    }
}