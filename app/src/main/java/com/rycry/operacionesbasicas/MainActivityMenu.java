package com.rycry.operacionesbasicas;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivityMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtener referencias a los botones del menú
        Button btnMenuSuma = findViewById(R.id.btnMenuSuma);
        Button btnMenuResta = findViewById(R.id.btnMenuResta);
        Button btnMenuMultiplicacion = findViewById(R.id.btnMenuMultiplicacion);
        Button btnMenuDivision = findViewById(R.id.btnMenuDivision);

        // Asignar un OnClickListener a cada botón
        btnMenuSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Iniciar la actividad de suma
                Intent intent = new Intent(MainActivityMenu.this, MainActivitySumar.class);
                startActivity(intent);
            }
        });

        btnMenuResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Iniciar la actividad de resta
                Intent intent = new Intent(MainActivityMenu.this, MainActivityRestar.class);
                startActivity(intent);
            }
        });

        btnMenuMultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Iniciar la actividad de multiplicación
                Intent intent = new Intent(MainActivityMenu.this, MainActivityMultiplicar.class);
                startActivity(intent);
            }
        });

        btnMenuDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Iniciar la actividad de división
                Intent intent = new Intent(MainActivityMenu.this, MainActivityDividir.class);
                startActivity(intent);
            }
        });
    }
}
