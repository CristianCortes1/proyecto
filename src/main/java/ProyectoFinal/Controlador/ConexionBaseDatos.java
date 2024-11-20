package ProyectoFinal.Controlador;

/**
 * @author Cristian Cortes
 * @author David Chacon 
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
