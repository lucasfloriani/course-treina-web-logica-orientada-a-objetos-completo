/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.calculadora.classes;

import com.github.calculadora.interfaces.CalculadorMatematico;

/**
 *
 * @author Lucas
 */
public abstract class CalculoMatematico implements CalculadorMatematico {
    protected int numero1;
    protected int numero2;
    
    public CalculoMatematico(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    @Override
    public boolean validar() {
        return this.numero1 >= 0 && this.numero2 >= 0;
    }
    
    @Override
    public final int calcular() {
        if(this.validar()) {
            return this.doCalcular();
        }
        return -1;
    }
    
    protected abstract int doCalcular();
}
