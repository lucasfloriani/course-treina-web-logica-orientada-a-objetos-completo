/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.calculadora.app;

import com.github.calculadora.fabricas.FabricaCalculosMatematicos;
import com.github.calculadora.interfaces.CalculadorMatematico;

/**
 *
 * @author Lucas
 */
public class Programa {
    
    public static void main(String[] args) {
        String calculo = "^";
        int numero1 = 2;
        int numero2 = 2;
        FabricaCalculosMatematicos fabrica = new FabricaCalculosMatematicos();
        CalculadorMatematico calculador = fabrica.criarCalculador(numero1, numero2, calculo);
        if (calculador != null) {
            System.out.println(calculador.calcular());
        } else {
            System.out.println("Calculo invalido.");
        }
    }
    
}
