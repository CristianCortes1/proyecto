package ProyectoFinal;

/**
 * @author Cristian Cortes
 * @author David Chacon 
 */
public class DecoradorCostoLaboratorio extends DecoradorCostoExtra {
    public DecoradorCostoLaboratorio(CalculadoraCostoInscripcion calculadora) {
        super(calculadora);
    }

    @Override
    public int obtenerCosto() {
        return super.obtenerCosto() + 50;
    }
}
