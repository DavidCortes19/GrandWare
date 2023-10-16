package com.example.grandware;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ProximaCita extends AppCompatActivity {

    Button recordatorioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proxima_cita);

        recordatorioButton = findViewById(R.id.recordatorioButton);

        recordatorioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ProximaCita.this, "Recordatorio activado", Toast.LENGTH_SHORT).show();
                // Aquí puedes implementar la funcionalidad de recordatorio
                // Por ejemplo, mostrar una notificación o configurar una alarma
            }
        });
    }
}


