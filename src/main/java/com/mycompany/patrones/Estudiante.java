/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patrones;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class Estudiante implements Observador {
    private String nombre;
    private String correo;

    public Estudiante(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    @Override
    public void actualizar(String mensaje) {
        System.out.println("Estudiante " + nombre + " recibido: " + mensaje);
    }
}

class Profesor {
    private List<Observador> estudiantes = new ArrayList<>();

    public void agregarObservador(Observador estudiante) {
        estudiantes.add(estudiante);
    }

    public void eliminarObservador(Observador estudiante) {
        estudiantes.remove(estudiante);
    }

    public void notificarObservadores(String mensaje) {
        for (Observador estudiante : estudiantes) {
            estudiante.actualizar(mensaje);
        }
    }

    public void cambiarNota(String curso, String nuevaNota) {
        System.out.println("Nota actualizada para el curso " + curso + ": " + nuevaNota);
        notificarObservadores("Nota actualizada para " + curso);
    }
}
