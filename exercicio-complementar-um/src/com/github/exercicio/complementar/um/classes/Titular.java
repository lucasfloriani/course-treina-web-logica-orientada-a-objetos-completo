/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.exercicio.complementar.um.classes;

/**
 *
 * @author Lucas
 */
public class Titular {
    private String nome;
    private String sobrenome;
    private int idade;
    private String CPF;
    private ContaCorrente contaCorrente;
    
    public Titular(ContaCorrente conta) {
        this.contaCorrente = conta;
    }
}
