package com.example.datosusuarios;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    // declarar
    Button send;
    Intent datosUsuario;
    EditText nombre;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // referenciar
        send = findViewById(R.id.button);
        nombre = findViewById(R.id.editTextText);

        datosUsuario = getIntent();


        // cambio vista
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=nombre.getText().toString();
                // Pasaremos de la actividad actual a OtraActivity
                Intent datosUsuario = new Intent(MainActivity.this, MainActivity2.class);

                //intent.putExtra("keyName", value);  // pass your values and retrieve them in the other Activity using keyName

                //datosUsuario.putExtra("variable_integer", objeto.getId());
                //datosUsuario.putExtra("variable_string", nombre.getNombre());
                datosUsuario.putExtra("variable_string", s);
                //datosUsuario.putExtra("objeto_float", objeto.getPrecio());
                startActivity(datosUsuario);

                // Intent datosUsuario = new Intent(MainActivity.this,MostrarDatos.class);
                // startActivity(datosUsuario);
            }
        });
    }
}