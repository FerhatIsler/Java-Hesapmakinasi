package com.ferhatisler.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText number1Text;
    EditText number2Text;
    TextView sonuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1Text = findViewById(R.id.number1Text);
        number2Text = findViewById(R.id.number2Text);
        sonuc = findViewById(R.id.sonuc);


    }

    public void topla(View view) {

        if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")) {

            sonuc.setText("Numara Giriniz!");


        } else {

            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());

            int result = number1 + number2;

            sonuc.setText("Result:" + result);
        }


    }


    public void cikar(View view) {
        if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")) {

            sonuc.setText("Numara Giriniz!");


        } else {

            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());

            int result = number1 - number2;

            sonuc.setText("Result:" + result);
        }
    }

    public void carp(View view) {
        if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")) {

            sonuc.setText("Numara Giriniz!");


        } else {

            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());

            int result = number1 * number2;

            sonuc.setText("Result:" + result);
        }
    }

    public void bol(View view) {
        if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")) {

            sonuc.setText("Numara Giriniz!");


        } else {

            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());

            int result = number1 / number2;

            sonuc.setText("Result:" + result);
        }


    }

}*