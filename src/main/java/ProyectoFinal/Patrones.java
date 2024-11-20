package ProyectoFinal;

import java.util.*;
/**
 * @author Cristian Cortes
 * @author David Chacon 
 */
public class Patrones {
    public static void main(String[] args) {
        
        // Crear Modelo, Vista y Controlador (MVC)
        ModeloInscripcion modelo = new ModeloInscripcion();
        VistaInscripcion vista = new VistaInscripcion("Gestion de Inscripciones", Arrays.asList("Matematicas", "Física", "Programacion"));
        ControlarInscripcion controlador = new ControlarInscripcion(modelo, vista);

        // ProxyInscripcion para gestionar autenticación
        controlador.autenticarUsuario(); // Autenticamos al usuario
        controlador.agregarCurso("Matematicas"); // Intentamos inscribir un curso

        // Mostrar cursos inscritos
        controlador.mostrarCursosInscritos();

        // Intentar eliminar un curso
        controlador.eliminarCurso("Matematicas");

        // Mostrar cursos inscritos nuevamente
        controlador.mostrarCursosInscritos();

        // Calcular costos de inscripción usando el patrón Decorador
        CalculadoraCostoInscripcion calculadora = new CalculadoraCostoInscripcion();
        calculadora = new DecoradorCostoLaboratorio(calculadora);
        calculadora = new DecoradorCostoBiblioteca(calculadora);
        System.out.println("\nCosto total de inscripcion: " + calculadora.obtenerCosto());

        // Gestión de notificaciones con el patrón Observador
        Profesor profesor = new Profesor();
        Observador estudiante1 = new Estudiante("Juan", "juan@mail.com");
        Observador estudiante2 = new Estudiante("Ana", "ana@mail.com");

        profesor.agregarObservador(estudiante1);
        profesor.agregarObservador(estudiante2);

        // Cambiar nota y notificar a los estudiantes
        profesor.cambiarNota("Programacion", "A");

        // Simulación de un error (ejemplo de manejo de errores)
        try {
            controlador.eliminarCurso("Fisica"); // Intentar eliminar un curso no inscrito
        } catch (Exception e) {
            vista.mostrarError("No se pudo eliminar el curso: " + e.getMessage());
        }

        // Mostrar la interacción final
        controlador.mostrarCursosInscritos();
    }
}

