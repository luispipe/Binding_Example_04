package com.example.bindingexample_04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button normal,binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        normal=findViewById(R.id.buttonNormal);
        binding=findViewById(R.id.buttonBinding);

        Intent normalView= new Intent(getApplicationContext(),
                NormalActivity.class);

        Intent bindingView= new Intent(getApplicationContext(),
                BindingActivity.class);

        normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(normalView);
            }
        });

        binding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(bindingView);
            }
        });

    }
}