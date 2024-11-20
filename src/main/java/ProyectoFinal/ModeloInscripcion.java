package ProyectoFinal;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Cristian Cortes
 * @author David Chacon 
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

