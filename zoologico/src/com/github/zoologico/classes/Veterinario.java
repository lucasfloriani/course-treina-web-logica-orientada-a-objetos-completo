/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.zoologico.classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lucas
 */
public class Veterinario {
    private String nome;
    private List<Animal> animais;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Veterinario() {
        this.animais = new ArrayList<Animal>();
    }
    
    public void atenderAnimal(Animal animalASerAtendido) {
        this.animais.add(animalASerAtendido);
    }
    
    public void deixarDeAtenderAnimal(int indiceAnimal) {
        this.animais.remove(indiceAnimal);
    }
    
    public void listarAnimaisAtendidos() {
        System.out.println("Animais atendidos: ");
        for(int i = 0; i < this.animais.size(); i++) {
            System.out.println("     - " + this.animais.get(i).getNome());
        }
    }
}
