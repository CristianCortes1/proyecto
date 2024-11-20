/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patrones;

/**
 *
 * @author PC
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
