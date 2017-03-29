package com.example.abrahamxsaboter.practica_formularios;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by abrahamxsaboter on 28/03/2017.
 */

public class Formulario2 extends AppCompatActivity {
    //variables globales
    TextView tvNombre;
    TextView tvDireccion;
    TextView tvTelefono;
    TextView tvControl;
    TextView tvFecha;
    Button btnEditar;
    Button btnEnvio2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formulario2);

        // Bundle : obtencion de parametros
        Bundle parametros = getIntent().getExtras();

        //Establecer los parametros
        String nombre = parametros.getString("nombre");
        String direccion = parametros.getString("direccion");
        String telefono = parametros.getString("telefono");
        String control = parametros.getString("control");
        String fecha = parametros.getString("fecha");

        //Inicializar los TextView
        tvNombre = (TextView) findViewById(R.id.idtxtNom);
        tvDireccion = (TextView) findViewById(R.id.idtxtDirec);
        tvTelefono = (TextView) findViewById(R.id.idtxtTel);
        tvControl = (TextView) findViewById(R.id.idtxtCont);
        tvFecha = (TextView) findViewById(R.id.idtxtFech);
        btnEditar = (Button) findViewById(R.id.btnEditar);
        btnEnvio2 = (Button) findViewById(R.id.btnEnvio2);

        //llama a los TextView
        tvNombre.setText(nombre);
        tvDireccion.setText(direccion);
        tvTelefono.setText(telefono);
        tvControl.setText(control);
        tvFecha.setText(fecha);

        //Boton Regresar
        btnEditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        btnEnvio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nom = tvNombre.getText().toString();
                String dir = tvDireccion.getText().toString();
                String tel = tvTelefono.getText().toString();
                String cont = tvControl.getText().toString();
                String fech = tvFecha.getText().toString();
                Intent i = new Intent(Formulario2.this, Formulario3.class);
                i.putExtra("nombre", nom);
                i.putExtra("direccion", dir);
                i.putExtra("telefono", tel);
                i.putExtra("control", cont);
                i.putExtra("fecha", fech);
                startActivity(i);
            }
        });
    }
}
