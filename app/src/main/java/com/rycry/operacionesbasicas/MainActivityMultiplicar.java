package com.rycry.operacionesbasicas;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivityMultiplicar extends AppCompatActivity {

    private EditText edNum1, edNum2;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplicacion);

        edNum1 = findViewById(R.id.edNum1);
        edNum2 = findViewById(R.id.edNum2);
        tvResultado = findViewById(R.id.tvResultado);
        Button btnMultiplicar = findViewById(R.id.btnMultiplicar);

        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                multiplicarNumeros();
            }
        });
    }

    private void multiplicarNumeros() {
        try {
            // Obtener los valores ingresados
            double num1 = Double.parseDouble(edNum1.getText().toString());
            double num2 = Double.parseDouble(edNum2.getText().toString());

            // Realizar la multiplicación
            double resultado = num1 * num2;

            // Mostrar el resultado en el TextView
            tvResultado.setText("Resultado: " + resultado);
        } catch (NumberFormatException e) {
            // Manejar el caso en que la entrada no sea un número válido
            tvResultado.setText(":(");
        }
    }
}
