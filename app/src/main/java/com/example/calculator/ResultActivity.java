package com.example.calculator;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView tvResult = findViewById(R.id.tvResult);

        Intent intent = getIntent();
        String result = intent.getStringExtra("RESULT");
        tvResult.setText("Результат: " + result);
    }
}