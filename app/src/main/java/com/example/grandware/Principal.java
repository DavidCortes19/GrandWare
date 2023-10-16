package com.example.grandware;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Principal extends AppCompatActivity {

    Button RegistrarMedicamento;

    Button VerRegistro;

    ImageButton RegistarMedicamentos;

    Button VerCita;

    Button menuButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        RegistrarMedicamento = findViewById(R.id.registerMedicineButton);

        VerRegistro = findViewById(R.id.viewRecordButton);

        // Obtén una referencia al ImageButton
        RegistarMedicamentos = findViewById(R.id.iconRegisterMedicine);

        VerCita = findViewById(R.id.nextAppointmentButton);

        menuButton = findViewById(R.id.menubtn);

        // Configura el clic del botón para mostrar el menú emergente
        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopupMenu();
            }
        });

        // Configura un OnClickListener para abrir la actividad de registro de medicamentos
        VerCita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Abre la actividad de registro de medicamentos
                Intent intent = new Intent(Principal.this, ProximaCita.class);
                startActivity(intent);
            }
        });
        // Configura un OnClickListener para abrir la actividad de registro de medicamentos
        RegistarMedicamentos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Abre la actividad de registro de medicamentos
                Intent intent = new Intent(Principal.this, RegistrarMedicamento.class);
                startActivity(intent);
            }
        });


        RegistrarMedicamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Principal.this, RegistrarMedicamento.class));
            }
        });
        VerRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Principal.this, VerRegistro.class));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu); // Infla el menú "main_menu"
        return true;
    }

    private void showPopupMenu() {
        PopupMenu popupMenu = new PopupMenu(this, menuButton);
        popupMenu.inflate(R.menu.main_menu);

        // Maneja las acciones de clic en los elementos del menú emergente
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if (item.getItemId() == R.id.menu_uno) {
                    // Abre la pantalla de perfil
                    // Aquí puedes iniciar la actividad correspondiente
                    return true;
                } else if (item.getItemId() == R.id.menu_ayuda) {
                    // Abre la pantalla de ayuda
                    // Aquí puedes iniciar la actividad correspondiente
                    return true;
                } else if (item.getItemId() == R.id.menu_configuracion) {
                    // Abre la pantalla de configuración
                    // Aquí puedes iniciar la actividad correspondiente
                    return true;
                } else if (item.getItemId() == R.id.menu_dos) {
                    // Abre la pantalla de selección de idioma
                    // Aquí puedes iniciar la actividad correspondiente
                    return true;
                } else if (item.getItemId() == R.id.menu_doctor) {
                    // Abre la pantalla de selección de doctor
                    // Aquí puedes iniciar la actividad correspondiente
                    return true;
                } else {
                    return false;
                }
            }
        });

        // Muestra el menú emergente
        popupMenu.show();
    }

}