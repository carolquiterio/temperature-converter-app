package com.example.temperatureconverter;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView tvFahreheintResult;
    TextView tvKelvinResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        Bundle params = intent.getExtras();
        Double celsius = params.getDouble("celsius");

        tvFahreheintResult = (TextView)findViewById(R.id.tvFahreheintResult);
        tvKelvinResult = (TextView)findViewById(R.id.tvKelvinResult);

        double varKelvin = celsius + 273.15;
        double varFahreheint = (celsius * 9/5) + 32;

        tvFahreheintResult.setText(varFahreheint + "");
        tvKelvinResult.setText(varKelvin + "");

    }

}
