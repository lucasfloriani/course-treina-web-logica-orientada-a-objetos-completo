/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.zoologico.classes;

/**
 *
 * @author Lucas
 */
public class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }

    public Gato(String nome, int idade, String especie) {
        super(nome, idade, especie);
    }
    
    public Gato(String nome, int idade) {
        super(nome, idade, "Gato");
    }

    @Override
    public void emitirBarulho() {
        if(this.estaVivo) {
            System.out.println("Miado do gato");
        } else {
            System.out.println("O animal morreu!");
        }
    }
}
