package proyectoFinal.Controlador;

/**
 *
 * @author PC
 */
public abstract class ProcesoAcademico {

    // Método plantilla
    public final void ejecutarProceso() {
        preProceso();
        procesoPrincipal();
        postProceso();
    }

    // Pasos genéricos
    protected void preProceso() {
        System.out.println("Preparando el entorno para el proceso académico...");
    }

    protected abstract void procesoPrincipal(); // Método abstracto que define el paso principal

    protected void postProceso() {
        System.out.println("Finalizando el proceso académico...");
    }
}