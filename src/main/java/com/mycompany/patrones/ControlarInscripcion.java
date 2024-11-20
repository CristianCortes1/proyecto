/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patrones;

/**
 *
 * @author PC
 */
public class ControlarInscripcion {
    private ModeloInscripcion modelo;
    private VistaInscripcion vista;
    private ProxyInscripcion proxyInscripcion;

    public ControlarInscripcion(ModeloInscripcion modelo, VistaInscripcion vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.proxyInscripcion = new ProxyInscripcion();
    }

    public void agregarCurso(String curso) {
        proxyInscripcion.inscribirCurso(curso);
        modelo.agregarInscripcion(curso);
        vista.mostrarMensaje("Curso agregado: " + curso);
    }

    public void eliminarCurso(String curso) {
        proxyInscripcion.eliminarInscripcion(curso);
        modelo.eliminarInscripcion(curso);
        vista.mostrarMensaje("Curso eliminado: " + curso);
    }

    public void mostrarCursosInscritos() {
        vista.mostrarInscripciones(modelo.obtenerInscripciones());
    }

    public void autenticarUsuario() {
        proxyInscripcion.autenticarUsuario();
    }
}
