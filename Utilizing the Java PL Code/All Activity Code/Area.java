package com.example.javapl2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Area extends AppCompatActivity {

    Button compute;
    EditText value;
    TextView total ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);

        compute = findViewById(R.id.entercompute);
        value = findViewById(R.id.entervalue);
        total = findViewById(R.id.last);

        compute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = value.getText().toString();
                float r = Float.parseFloat(s);
                float radius = (float) (3.1415 * r * r);
                total.setText("Area is: " + radius);
            }
        });

    }
}