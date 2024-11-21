package ProyectoFinal.Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class Profesor {
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
