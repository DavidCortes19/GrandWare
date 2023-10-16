package com.example.grandware;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class VerRegistro extends AppCompatActivity {

    private TimePicker timePicker;
    private DatePicker datePicker;
    private Button saveDateTimeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_registro);

        timePicker = findViewById(R.id.timePicker);
        datePicker = findViewById(R.id.datePicker);
        saveDateTimeButton = findViewById(R.id.saveDateTimeButton);

        saveDateTimeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener la fecha y la hora seleccionadas
                int hour = timePicker.getHour();
                int minute = timePicker.getMinute();
                int day = datePicker.getDayOfMonth();
                int month = datePicker.getMonth() + 1; // Se suma 1 ya que los meses comienzan desde 0
                int year = datePicker.getYear();

                // Crear un mensaje con la fecha y hora seleccionadas
                String message = "Fecha y Hora: " + day + "/" + month + "/" + year + " " + hour + ":" + minute;

                // Mostrar un mensaje Toast
                Toast.makeText(VerRegistro.this, message, Toast.LENGTH_SHORT).show();

                // Iniciar la actividad principal (reemplaza "MainActivity.class" con el nombre de tu actividad principal)
                Intent intent = new Intent(VerRegistro.this, Principal.class);
                startActivity(intent);
            }
        });
    }
}
