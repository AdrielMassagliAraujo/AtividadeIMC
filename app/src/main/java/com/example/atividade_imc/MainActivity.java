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
    }

    EditText txt1, txt2;
    TextView txt3;

    int val1, val2;


    public void Calcular(View view){
        val1 = Integer.parseInt(txt1.getText().toString());
        val2 = Integer.parseInt(txt2.getText().toString());

        int cal = val2 / (val1 * val1);

        txt3.setText(Integer.valueOf(cal).toString());
    }
}