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
// Tudo que é declarado numa interface é
// publico, então os métodos devem ser publicos
public interface Animavel {
    boolean ehAdulto();
    void emitirBarulho();
    void morrer();
}
