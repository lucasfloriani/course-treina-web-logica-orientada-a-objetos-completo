/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.calculadora.classes;

/**
 *
 * @author Lucas
 */
public class Adicao extends CalculoMatematico {

    public Adicao(int numero1, int numero2) {
        super(numero1, numero2);
    }

    @Override
    protected int doCalcular() {
        return this.numero1 + this.numero2;
    }
    
}
