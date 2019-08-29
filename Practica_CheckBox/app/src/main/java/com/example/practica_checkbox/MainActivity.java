package com.example.practica_checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.TestLooperManager;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText valor1;
    private EditText valor2;
    private CheckBox sumar;
    private CheckBox restar;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valor1 = (EditText) findViewById(R.id.Valor1);
        valor2 = (EditText) findViewById(R.id.Valor2);
        sumar = (CheckBox) findViewById(R.id.Sumar);
        restar = (CheckBox) findViewById(R.id.Restar);
        resultado = (TextView) findViewById(R.id.resultado);
    }

    public void Calcular(View view){
        String numero1 = valor1.getText().toString();
        String numero2 = valor2.getText().toString();
        String result = "";

        int num1 = Integer.parseInt(numero1);
        int num2 = Integer.parseInt(numero2);

        if(sumar.isChecked()){
            result += " La suma es: " + String.valueOf(num1+num2) + " / ";
        }
        if(restar.isChecked()){
            result += " La resta es: " + String.valueOf(num1-num2);
        }

        resultado.setText(result);
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
    }
}
