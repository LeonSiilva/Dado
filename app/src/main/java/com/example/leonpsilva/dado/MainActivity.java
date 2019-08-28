package com.example.leonpsilva.dado;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    private TextView textViewResultado;
    private ImageView imageViewMostrar;
    private ImageView imageViewMostrar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewMostrar2 = findViewById(R.id.imageViewMostrar2);
        imageViewMostrar = findViewById(R.id.imageViewMostrar);
        textViewResultado = findViewById(R.id.textViewResultado);
        textViewResultado.setText("");
    }

    public void dado (View v) {
        Random numero = new Random();
        Random numero2 = new Random();

        Integer valor = 1 + numero.nextInt(6);
        Integer valor2 = 1 + numero2.nextInt(6);


        Integer somadosvalores = valor + valor2;

        String resultadosoma = somadosvalores.toString();
        textViewResultado.setText(resultadosoma);

        if (valor == 1) {
            imageViewMostrar.setImageResource(R.drawable.dado1);
        } else if (valor == 2) {
            imageViewMostrar.setImageResource(R.drawable.dado2);
        } else if (valor == 3) {
            imageViewMostrar.setImageResource(R.drawable.dado3);
        } else if (valor == 4) {
            imageViewMostrar.setImageResource(R.drawable.dado4);
        } else if (valor == 5) {
            imageViewMostrar.setImageResource(R.drawable.dado5);
        } else if (valor == 6) {
            imageViewMostrar.setImageResource(R.drawable.dado6);
        }

        if (valor2 == 1) {
            imageViewMostrar2.setImageResource(R.drawable.dado1);
        } else if (valor2 == 2) {
            imageViewMostrar2.setImageResource(R.drawable.dado2);
        } else if (valor2 == 3) {
            imageViewMostrar2.setImageResource(R.drawable.dado3);
        } else if (valor2 == 4) {
            imageViewMostrar2.setImageResource(R.drawable.dado4);
        } else if (valor2 == 5) {
            imageViewMostrar2.setImageResource(R.drawable.dado5);
        } else if (valor2 == 6) {
            imageViewMostrar2.setImageResource(R.drawable.dado6);
        }

    }

}





