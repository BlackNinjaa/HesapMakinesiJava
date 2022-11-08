package com.halil.hesapmakinesijava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        EditText Number1Text;
        EditText Number2Text;
        TextView sonucText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Number1Text = findViewById(R.id.Number1Text);
        Number2Text = findViewById(R.id.Number2Text);
        sonucText = findViewById(R.id.sonuc);


    }
    public void topla(View view){
        if(Number1Text.getText().toString().matches("") || Number2Text.getText().toString().matches("")){
            sonucText.setText("Lütfen Sayı gir !");

        }
        else{
            int number1 = Integer.parseInt(Number1Text.getText().toString());
            int number2 = Integer.parseInt(Number2Text.getText().toString());

            int sonuc = number1+number2;
            sonucText.setText("Sonuc : "+ sonuc);
        }


    }
    public void cikar(View view){
        if(Number1Text.getText().toString().matches("") || Number2Text.getText().toString().matches("")){
            sonucText.setText("Lütfen Sayı gir !");

        }
        else{
            int number1 = Integer.parseInt(Number1Text.getText().toString());
            int number2 = Integer.parseInt(Number2Text.getText().toString());

            int sonuc = number1-number2;
            sonucText.setText("Sonuc : "+ sonuc);
        }
    }
    public void carp(View view){

        if(Number1Text.getText().toString().matches("") || Number2Text.getText().toString().matches("")){
            sonucText.setText("Lütfen Sayı gir !");

        }
        else{
            int number1 = Integer.parseInt(Number1Text.getText().toString());
            int number2 = Integer.parseInt(Number2Text.getText().toString());

            int sonuc = number1*number2;
            sonucText.setText("Sonuc : "+ sonuc);
        }
    }
    public void bol(View view){
        if(Number1Text.getText().toString().matches("") || Number2Text.getText().toString().matches("")){
            sonucText.setText("Lütfen Sayı gir !");

        }
        else{
            int number1 = Integer.parseInt(Number1Text.getText().toString());
            int number2 = Integer.parseInt(Number2Text.getText().toString());

            int sonuc = number1/number2;
            sonucText.setText("Sonuc : "+ sonuc);
        }

    }
}