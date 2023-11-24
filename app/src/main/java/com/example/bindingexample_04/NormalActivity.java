package com.example.bindingexample_04;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class NormalActivity extends AppCompatActivity {

    Button red,blue;
    ImageView circle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);

        red= findViewById(R.id.buttonRed);
        blue=findViewById(R.id.buttonBlue);
        circle=findViewById(R.id.imageViewCircle);

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                circle.setColorFilter(Color.RED);
            }
        });

        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                circle.setColorFilter(Color.BLUE);
            }
        });

    }
}