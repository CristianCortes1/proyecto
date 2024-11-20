/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patrones;

/**
 *
 * @author PC
 */
public class DecoradorCostoBiblioteca extends DecoradorCostoExtra {
    public DecoradorCostoBiblioteca(CalculadoraCostoInscripcion calculadora) {
        super(calculadora);
    }

    @Override
    public int obtenerCosto() {
        return super.obtenerCosto() + 30;
    } }
    

