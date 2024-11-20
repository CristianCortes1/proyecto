package ProyectoFinal.Controlador;

import ProyectoFinal.Controlador.CalculadoraCostoInscripcion;

/**
 * @author Cristian Cortes
 * @author David Chacon 
 */
public class DecoradorCostoExtra extends CalculadoraCostoInscripcion {
     protected CalculadoraCostoInscripcion calculadoraDecorada;

    public DecoradorCostoExtra(CalculadoraCostoInscripcion calculadora) {
        this.calculadoraDecorada = calculadora;
    }

    @Override
    public int obtenerCosto() {
        return calculadoraDecorada.obtenerCosto();
    }
}
