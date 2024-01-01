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
public class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }
    
    public Cachorro(String nome, int idade, String especie) {
        super(nome, idade, especie);
    }
    
    public Cachorro(String nome, int idade) {
        super(nome, idade, "Cachorro");
    }

    @Override
    public void emitirBarulho() {
        if(this.estaVivo) {
            System.out.println("Latido do cachorro");
        } else {
            System.out.println("O animal morreu!");
        }
    }
    
    @Override
    public boolean ehAdulto() {
        if(this.estaVivo) {
            return this.idade >= 2;
        }
        return false;
    }
}
