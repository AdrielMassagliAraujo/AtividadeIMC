package com.example.atividade_imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = findViewById(R.id.textalt);
        txt2 = findViewById(R.id.textpeso);
        txt3 = findViewById(R.id.textresult);
        txt4 = findViewById(R.id.textresult2);
    }

    EditText txt1, txt2;
    TextView txt3, txt4;

    float val1;
    int val2;


    public void Calcular(View view){
        val1 = Float.parseFloat(txt1.getText().toString());
        val2 = Integer.parseInt(txt2.getText().toString());

        float calc = val2 / (val1 * val1);

        txt3.setText(Float.valueOf(calc).toString());

        if(calc > 43){
            txt4.setText("Obesidade Mórbida");
        }
        else if(calc > 30){
            txt4.setText("Obesidade Moderada");
        }
        else if(calc > 25){
            txt4.setText("Obesidade Leve");
        }
        else if(calc > 20){
            txt4.setText("Normal");
        }
        else if(calc < 20){
            txt4.setText("Abaixo do Normal");
        }
    }

    public void Calcular2 (View view){
        val1 = Float.parseFloat(txt1.getText().toString());
        val2 = Integer.parseInt(txt2.getText().toString());

        float calc = val2 / (val1 * val1);

        txt3.setText(Float.valueOf(calc).toString());

        if(calc > 39){
            txt4.setText("Obesidade Mórbida");
        }
        else if(calc > 29){
            txt4.setText("Obesidade Moderada");
        }
        else if(calc > 24){
            txt4.setText("Obesidade Leve");
        }
        else if(calc > 19){
            txt4.setText("Normal");
        }
        else if(calc < 19){
            txt4.setText("Abaixo do Normal");
        }
    }

}