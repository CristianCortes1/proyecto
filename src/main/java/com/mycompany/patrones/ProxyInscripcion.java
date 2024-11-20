/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patrones;

/**
 *
 * @author PC
 */
public class ProxyInscripcion {
     private Inscripcion inscripcionReal = new Inscripcion();
    private boolean usuarioAutenticado = false;

    public void autenticarUsuario() {
        usuarioAutenticado = true;
        System.out.println("Usuario autenticado.");
    }

    public void inscribirCurso(String curso) {
        if (usuarioAutenticado) {
            inscripcionReal.inscribirCurso(curso);
        } else {
            System.err.println("Error: Usuario no autenticado.");
        }
    }

    public void eliminarInscripcion(String curso) {
        if (usuarioAutenticado) {
            inscripcionReal.eliminarInscripcion(curso);
        } else {
            System.err.println("Error: Usuario no autenticado.");
        }
    }
}
