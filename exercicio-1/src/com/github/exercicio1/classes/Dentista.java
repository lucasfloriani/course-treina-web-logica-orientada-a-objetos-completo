/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.exercicio1.classes;

/**
 *
 * @author Lucas
 */
public class Dentista {
    private String Nome;
    private String Sobrenome;
    private String Especialidade;
    private String RegistroRegional;
    private boolean Ativo;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String Sobrenome) {
        this.Sobrenome = Sobrenome;
    }

    public String getEspecialidade() {
        return Especialidade;
    }

    public void setEspecialidade(String Especialidade) {
        this.Especialidade = Especialidade;
    }

    public String getRegistroRegional() {
        return RegistroRegional;
    }

    public void setRegistroRegional(String RegistroRegional) {
        this.RegistroRegional = RegistroRegional;
    }

    public boolean isAtivo() {
        return Ativo;
    }

    public void setAtivo(boolean Ativo) {
        this.Ativo = Ativo;
    }
    
    public void AtenderPacientes() {
        // Implementação da função
    }
    
    public void MarcarConsulta() {
        // Implementação da função
    }
        
    public void RemarcarConsulta() {
        // Implementação da função
    }
            
    public void CancelarConsulta() {
        // Implementação da função
    }
    
    public void Disponibilidade() {
        // Implementação da função
    }
}
