package com.example.currencyconverter;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertDollarsToPounds(View view) {
        EditText dollarAmount = (EditText) findViewById(R.id.dollarAmount);
        TextView textOut = (TextView) findViewById(R.id.NewAmount);
        String sDollarAmount = dollarAmount.getText().toString();

        if (sDollarAmount.matches("")) {
            Toast.makeText(this, "Please enter a number", Toast.LENGTH_SHORT).show();
            return;
        }
        Double dollarsToConvert = Double.parseDouble(dollarAmount.getText().toString());
        Double poundsAmount = dollarsToConvert * 0.80;
        String s = String.format(poundsAmount + "£");

        textOut.setText(s);
        if (view != null) {
            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }






        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
