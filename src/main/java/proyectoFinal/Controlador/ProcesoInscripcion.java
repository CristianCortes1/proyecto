package proyectoFinal.Controlador;

/**
 *
 * @author PC
 */
public class ProcesoInscripcion extends ProcesoAcademico {

    @Override
    protected void procesoPrincipal() {
        System.out.println("Realizando el proceso principal de inscripción...");
    }

    @Override
    protected void postProceso() {
        System.out.println("Guardando detalles del proceso de inscripción...");
        super.postProceso();
    }
}