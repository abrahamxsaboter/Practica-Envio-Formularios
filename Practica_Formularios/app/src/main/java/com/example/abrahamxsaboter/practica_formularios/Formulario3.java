package com.example.abrahamxsaboter.practica_formularios;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by abrahamxsaboter on 29/03/2017.
 */

public class Formulario3 extends AppCompatActivity {
    //variables globales
    TextView tvNombre;
    TextView tvDireccion;
    TextView tvTelefono;
    TextView tvControl;
    TextView tvFecha;
    Button btnsalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formulario3);

        // Bundle : obtencion de parametros
        Bundle parametros = getIntent().getExtras();

        //Establecer los parametros
        String nom = parametros.getString("nombre");
        String dir = parametros.getString("direccion");
        String tel = parametros.getString("telefono");
        String cont = parametros.getString("control");
        String fech = parametros.getString("fecha");

        //Inicializar los TextView
        tvNombre = (TextView) findViewById(R.id.idtxtNom);
        tvDireccion = (TextView) findViewById(R.id.idtxtDirec);
        tvTelefono = (TextView) findViewById(R.id.idtxtTel);
        tvControl = (TextView) findViewById(R.id.idtxtCont);
        tvFecha = (TextView) findViewById(R.id.idtxtFech);
        btnsalir = (Button)findViewById(R.id.btnSalir);

        //llama a los TextView
        tvNombre.setText(nom);
        tvDireccion.setText(dir);
        tvTelefono.setText(tel);
        tvControl.setText(cont);
        tvFecha.setText(fech);

        btnsalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // con esto vamos al Activity principal
                Intent intent = new Intent(Intent.ACTION_MAIN);
                //Finaliza la aplicacion
                finish();
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);

            }
        });
    }
}