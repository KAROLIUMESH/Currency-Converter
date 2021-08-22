package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void onclick(View  view){

        EditText editText = (EditText) findViewById(R.id.edittext);

        String amountinrup = editText.getText().toString();
        double amountinrupdouble = Double.parseDouble(amountinrup);

        double amountindoller = amountinrupdouble / 70;

        String amountindollerdouble = String.format("%.2f", amountindoller);

        Toast.makeText(this, "Amount in Doller " + amountindollerdouble.toString(), Toast.LENGTH_LONG).show();
        Log.i("Converted Amount", amountindollerdouble.toString());
        Log.i("Info","Converted");

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}