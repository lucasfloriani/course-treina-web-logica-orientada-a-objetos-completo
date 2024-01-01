/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.calculadora.fabricas;

import com.github.calculadora.classes.Adicao;
import com.github.calculadora.classes.Divisao;
import com.github.calculadora.classes.Multiplicacao;
import com.github.calculadora.classes.Potenciacao;
import com.github.calculadora.classes.Subtracao;
import com.github.calculadora.interfaces.CalculadorMatematico;

/**
 *
 * @author Lucas
 */
public class FabricaCalculosMatematicos {
    
    public CalculadorMatematico criarCalculador(int numero1, int numero2, String calculo) {
        if (calculo.equals("+")) {
            return new Adicao(numero1, numero2);
        } else if(calculo.equals("-")) {
            return new Subtracao(numero1, numero2);
        } else if(calculo.equals("*")) {
            return new Multiplicacao(numero1, numero2);
        } else if(calculo.equals("/")) {
            return new Divisao(numero1, numero2);
        } else if(calculo.equals("^")) {
            return new Potenciacao(numero1, numero2);
        }
        
        return null;
    }
    
}
