package ProyectoFinal.Modelo;




/**
 * @author Cristian Cortes
 * @author David Chacon 
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


