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
// Classes abstratas podem deixar de implementar
// metodos de uma interface, porem as classes
// que herdam dessa classe terão que implementar
// estas funcionalidades
public abstract class Animal implements Animavel {
    private String nome;
    private String especie;
    protected int idade;
    protected boolean estaVivo;

    /******Metodos Acessores******/
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getEspecie() {
        return this.especie;
    }
    
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    public int getIdade() {
        return this.idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public Boolean estaVivo() {
        return this.estaVivo;
    }
    /******Metodos Acessores******/
    
    // - Sobrecarga
    // É quando eu tenho um método com mesmo nome
    // só que ele possui assinaturas diferentes, onde
    // assinatura de um metodo seria constituida pelo seu
    // nome, tipo de retorno, e parâmetros (considerando os tipos de valores,
    // e não seus respectivos nome).
    public Animal(String nome) {
        this.nome = nome;
        this.estaVivo = true;
    }
    
    public Animal(String nome, int idade, String especie) {
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
        this.estaVivo = true;
    }
    
    // Metodo abstrato:
    // Somente pode ser criado em classes abstratas.
    // Obriga que as classes que herdam a classe abstrata
    // implementem o metodo.
    // Metodo abstrato fica em branco.
    // Demonstra que a classe abstrata não deve conhecer
    // como implementar este metodo, e sim suas subsclasses
    @Override
    public abstract void emitirBarulho();
    
    @Override
    public boolean ehAdulto() {
        if(this.estaVivo) {
            return idade >= 1;
        }
        return false;
    }
    
    // Keyword final
    // Evita que o metodo possa ser sobrescrito
    @Override
    public final void morrer() {
        this.estaVivo = false;
    }
}
