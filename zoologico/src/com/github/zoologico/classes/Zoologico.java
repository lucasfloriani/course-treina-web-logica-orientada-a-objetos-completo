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
public class Zoologico {
    private String nome;
    private List<Animal> animais;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Zoologico() {
        this.animais = new ArrayList<Animal>();
    }
    
    public void adicionarAnimal(Animal animalASerAdicionado) {
        this.animais.add(animalASerAdicionado);
    }
    
    public void removerAnimal(int indiceDoAnimal) {
        this.animais.remove(indiceDoAnimal);
    }
    
    public void listarAnimais() {
        System.out.println("Animais do zoológico: ");
        for (int i = 0; i < this.animais.size(); i++) {
            System.out.println("    - " + animais.get(i).getNome());
        }
    }
}
