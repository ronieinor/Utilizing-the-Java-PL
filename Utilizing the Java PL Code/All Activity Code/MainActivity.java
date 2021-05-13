package com.example.javapl2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn1(View view) {

        Intent circumference = new Intent(this, circumference.class);
        startActivity(circumference);

    }
    public void btn2(View view) {

        Intent area = new Intent(this, Area.class);
        startActivity(area);

    }

    public void btn3(View view) {
        Intent diameter = new Intent(this, Diameter.class);
        startActivity(diameter);
    }
}