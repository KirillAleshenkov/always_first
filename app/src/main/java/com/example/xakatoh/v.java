package com.example.xakatoh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class v extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v);
    }
    public void onClick(View view){
        Intent intent = new Intent(this,Rgroup.class);
        startActivity(intent);
    }
    public void onClick1(View view){
        Intent intent = new Intent(this,Dgroup.class);
        startActivity(intent);
    }
    public void onClick2(View view){
        Intent intent = new Intent(this,RedGroup.class);
        startActivity(intent);
    }
}