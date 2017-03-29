package com.example.abrahamxsaboter.practica_formularios;

/**
 * Created by abrahamxsaboter on 28/03/2017.
 */

public class Datos {
    private String Nombre,Direccion, Telefono, Control;

    public Datos (String nombre, String direccion, String telefono, String control){
        Nombre = nombre;
        Direccion = direccion;
        Telefono = telefono;
        Control = control;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getControl() {
        return Control;
    }

    public void setControl(String control) {
        Control = control;
    }
}
