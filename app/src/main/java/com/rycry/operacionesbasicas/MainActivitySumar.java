package com.rycry.operacionesbasicas;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivitySumar extends AppCompatActivity {

    private EditText edNum1, edNum2;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma);

        edNum1 = findViewById(R.id.edNum1);
        edNum2 = findViewById(R.id.edNum2);
        tvResultado = findViewById(R.id.tvResultado);
        Button btnSumar = findViewById(R.id.btnDividir);

        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sumarNumeros();
            }
        });
    }

    private void sumarNumeros() {
        try {
            double num1 = Double.parseDouble(edNum1.getText().toString());
            int num2 = Integer.parseInt(edNum2.getText().toString());
            double resultado=num1+num2;
            tvResultado.setText(resultado+"");

        } catch (NumberFormatException e) {
            tvResultado.setText(":(");
        }
    }
}
