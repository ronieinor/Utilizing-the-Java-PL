package com.example.javapl2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Diameter extends AppCompatActivity {

    Button compute;
    EditText value;
    TextView total ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diameter);

        compute = findViewById(R.id.entercompute);
        value = findViewById(R.id.entervalue);
        total = findViewById(R.id.last);

        compute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = value.getText().toString();
                double r = Double.parseDouble(s);
                double radius = 2 * r;
                total.setText("Diameter is: " + radius);
            }
        });

    }
}