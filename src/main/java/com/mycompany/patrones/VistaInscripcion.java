package com.mycompany.patrones;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class VistaInscripcion {

    private String titulo;
    private List<String> listaCursos;

    // Constructor predeterminado
    public VistaInscripcion() {
        this.titulo = "Gestion de Inscripciones";
        this.listaCursos = new ArrayList<>(); // Inicializamos como una lista vacía
    }

    // Constructor con parámetros
    public VistaInscripcion(String titulo, List<String> listaCursos) {
        this.titulo = titulo;
        this.listaCursos = listaCursos;
    }

    public void mostrarInscripciones(List<String> inscripciones) {
        System.out.println("\n" + titulo);
        if (inscripciones.isEmpty()) {
            System.out.println("No hay cursos inscritos actualmente.");
        } else {
            System.out.println("Cursos inscritos:");
            for (String curso : inscripciones) {
                System.out.println("- " + curso);
            }
        }
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println("\n[Mensaje]: " + mensaje);
    }

    public void mostrarError(String mensaje) {
        System.err.println("\n[Error]: " + mensaje);
    }

    public String solicitarDatosInscripcion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nCursos disponibles:");
        for (int i = 0; i < listaCursos.size(); i++) {
            System.out.println((i + 1) + ". " + listaCursos.get(i));
        }
        System.out.print("Ingrese el nombre del curso a inscribir: ");
        return scanner.nextLine();
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setListaCursos(List<String> listaCursos) {
        this.listaCursos = listaCursos;
    }
}
