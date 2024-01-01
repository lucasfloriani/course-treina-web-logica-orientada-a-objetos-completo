package com.github.exercicio1.app;

import com.github.exercicio1.classes.Dentista;
import com.github.exercicio1.classes.Paciente;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucas
 */
public class Programa {
    public static void main(String[] args) {
        System.out.println("==== Teste da classe Dentista ====");
        Dentista dentista = new Dentista();
        dentista.setNome("Nome");
        dentista.setSobrenome("Sobrenome");
        dentista.setEspecialidade("Especialidade");
        dentista.setRegistroRegional("Registro");
        dentista.setAtivo(true);
        System.out.println("Nome: " + dentista.getNome());
        System.out.println("Sobrenome: " + dentista.getSobrenome());
        System.out.println("Especialidade: " + dentista.getEspecialidade());
        System.out.println("Registro Regional: " + dentista.getRegistroRegional());
        System.out.println("Dentista ativo? " + dentista.isAtivo());
        dentista.AtenderPacientes();
        dentista.MarcarConsulta();
        dentista.RemarcarConsulta();
        dentista.CancelarConsulta();
        dentista.Disponibilidade();
        
        System.out.println("\n==== Teste da classe Paciente ====");
        Paciente paciente = new Paciente();
        paciente.setCodigo("Código");
        paciente.setNome("Nome");
        paciente.setSobrenome("Sobrenome");
        paciente.setIdade(22);
        paciente.setSexo("Masculino");
        paciente.setTelefone("0000-0000");
        paciente.setEndereco("Endereço");
        System.out.println("Código: " + paciente.getCodigo());
        System.out.println("Nome: " + paciente.getNome());
        System.out.println("Sobrenome: " + paciente.getSobrenome());
        System.out.println("Idade: " + paciente.getIdade());
        System.out.println("Sexo: " + paciente.getSexo());
        System.out.println("Telefone: " + paciente.getTelefone());
        System.out.println("Endereço: " + paciente.getEndereco());
        paciente.MarcarConsulta();
        paciente.RemarcarConsulta();
        paciente.Consultar();
        paciente.CancelarConsulta();
    }
}
