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
public class ModeloInscripcion {
  
    private List<String> datosInscripcion = new ArrayList<>();
    private ConexionBaseDatos conexionBD;

    public ModeloInscripcion() {
        this.conexionBD = ConexionBaseDatos.obtenerInstancia();
    }

    public List<String> obtenerInscripciones() {
        return new ArrayList<>(datosInscripcion);
    }

    public void agregarInscripcion(String curso) {
        datosInscripcion.add(curso);
    }

    public void eliminarInscripcion(String curso) {
        datosInscripcion.remove(curso);
    }
}  

