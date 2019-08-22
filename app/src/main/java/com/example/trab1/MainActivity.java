package com.example.trab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcular(View view){
        EditText inputPeso = findViewById(R.id.inputPeso);
        EditText inputAltura = findViewById(R.id.inputAltura);
        TextView outputCond = findViewById(R.id.output);
        RadioButton radioMasc = findViewById(R.id.masc);
        String seuIMC = "Seu imc é:";

        float peso = Float.parseFloat(inputPeso.getText().toString());
        float altura = Float.parseFloat(inputAltura.getText().toString());

        float imc = (peso/(altura * altura));

        if(radioMasc.isChecked()){
            if(imc < 20.7){
                outputCond.setText(seuIMC +imc+ "\nCondição: Abaixo do peso");
            }else if(imc >= 20.7 && imc <= 26.4){
                outputCond.setText(seuIMC +imc+ "\nCondição: No peso normal");
            }else if(imc >= 26.4 && imc <= 27.8){
                outputCond.setText(seuIMC +imc+ "\nCondição: Marginalmente acima do peso");
            }else if(imc >= 27.8 && imc <= 31.1){
                outputCond.setText(seuIMC +imc+ "\nCondição: Acima do peso ideal");
            }else if(imc >31.1){
                outputCond.setText(seuIMC +imc+ "\nCondição: Obeso");
            }
        }else{
            if(imc < 19.1){
                outputCond.setText(seuIMC +imc+ "\nCondição: Abaixo do peso");
            }else if(imc >= 19.1 && imc <= 25.8){
                outputCond.setText(seuIMC +imc+ "\nCondição: No peso normal");
            }else if(imc >= 25.8 && imc <= 27.3){
                outputCond.setText(seuIMC +imc+ "\nCondição: Marginalmente acima do peso");
            }else if(imc >= 27.3 && imc <= 32.3){
                outputCond.setText(seuIMC +imc+ "\nCondição: Acima do peso ideal");
            }else if(imc >32.3){
                outputCond.setText(seuIMC +imc+ "\nCondição: Obeso");
            }
        }
    }
}



