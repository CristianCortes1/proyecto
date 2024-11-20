/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patrones;

/**
 *
 * @author PC
 */
public class ConexionBaseDatos {
      private static ConexionBaseDatos instancia;
    private String conexion;

    private ConexionBaseDatos() {
        this.conexion = "Conexion establecida";
    }

    public static ConexionBaseDatos obtenerInstancia() {
        if (instancia == null) {
            instancia = new ConexionBaseDatos();
        }
        return instancia;
    }
}
