package ProyectoFinal.Controlador;

import ProyectoFinal.Controlador.CalculadoraCostoInscripcion;

/**
 * @author Cristian Cortes
 * @author David Chacon 
 */
public class DecoradorCostoBiblioteca extends DecoradorCostoExtra {
    public DecoradorCostoBiblioteca(CalculadoraCostoInscripcion calculadora) {
        super(calculadora);
    }

    @Override
    public int obtenerCosto() {
        return super.obtenerCosto() + 30;
    } }
    

