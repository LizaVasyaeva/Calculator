package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText etNumber1, etNumber2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNumber1 = findViewById(R.id.etNumber1);
        etNumber2 = findViewById(R.id.etNumber2);
        Button btnSum = findViewById(R.id.btnSum);

        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String num1Str = etNumber1.getText().toString();
                String num2Str = etNumber2.getText().toString();

                if (num1Str.isEmpty() || num2Str.isEmpty()) {
                    return;
                }

                try {
                    double num1 = Double.parseDouble(num1Str);
                    double num2 = Double.parseDouble(num2Str);
                    double sum = num1 + num2;

                    Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                    intent.putExtra("RESULT", String.valueOf(sum));
                    startActivity(intent);
                } catch (NumberFormatException e) {
                }
            }
        });
    }
}