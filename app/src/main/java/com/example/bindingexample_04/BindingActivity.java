package com.example.bindingexample_04;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.bindingexample_04.databinding.ActivityBindingBinding;

public class BindingActivity extends AppCompatActivity {
/*
    La variable binding siempre sera del tipo de clase, conformado
    por el nombre del layout asociado sin espacio más la palabra binding
    Ej: NormalActivity, layout: activity_normal --> ActivityNormalBinding

*/

    private ActivityBindingBinding binding;
    Button red,blue;
    ImageView circle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*Inflate es la funcionalidad de android que se usa para inflar las vistas
        * es decir llenar una vista con componentes (botones, imagenes, textos,etc)
        * */
        binding= ActivityBindingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        red= binding.buttonRed;
        blue=binding.buttonBlue;
        circle=binding.imageViewCircle;

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