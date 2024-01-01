/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.zoologico.app;

import com.github.zoologico.classes.Animal;
import com.github.zoologico.classes.Cachorro;
import com.github.zoologico.classes.Gato;
import com.github.zoologico.classes.Veterinario;
import com.github.zoologico.classes.Zoologico;

/**
 *
 * @author Lucas
 */
// **LSP (vulgo Polimorfismo) -  Liscobe Substitution Principle (Principio de substituição de Liscobe)**
// É a teria dos conjuntos matemáticos dentro do nosso código
// (conjunto e subconjuntos)
// 
// | Animal ------------------|
// |   | Gato ------|         |
// |   |            |         |
// |   |------------|         |
// |                          |
// |   | Cachorro --|         |
// |   |            |         |
// |   |------------|         |
// |--------------------------|
//
// `Se eu tenho uma classe mais abstrata, eu consigo definir um objeto
//  dessa classe mais abstrata com uma concretização`
//
// `Desenvolva sempre com o nivel de abstração mais alto possível`
//

// **Composição** (relação 1 ou muitos(n))
// Quando uma classe é composta por objetos de outra classe.
// Isso quer dizer que uma das classes envolvidas depende de
// maneira direta da existência de outra classe para que ela também
// possa existir.
// Neste caso, nós geralmente temos duas definições para as classes envolvidas
// na composição: a classe forte, que domina o relacionamento e que é
// importante para que a outra classe possa existir. Um exemplo clássico
// de composição é a relação entre uma classe que presenta uma nota fiscal
// e a classe que representa os itens da nota fiscal. A nota fiscal, para
// existir, depende explicitamente da existência dos itens da nota fiscal.
// Sendo assim, temos aqui uma relação de composição: a nota fiscal é composta
// por itens da nota fiscal.

// **Agregação** (relação 0 ou muitos(n))
// Ela ocorre quando dois ou mais objetos se relacionam na intenção de um
// objeto "complementar" informações no outro objeto. Os dois objetos não
// necessariamente dependem um do outro para existir, mas, quando unidos,
// apresentam um sentido mais completo e descritivo sobre uma determinada
// situação.
// Um exemplo clássico é a relação entre uma classe Pessoa e uma outra
// classe Endereço. Ambos os objetos podem existir de maneira independente
// um do outro (pois não são somente pessoas que possuem endereço). Mas,
// quando unímos objetos da classe Pessoa com objetos da classe Endereço,
// nos acabamos tendo uma pessoa mais "completa": uma pessoa com um endereço.
// O mesmo vale para o endereço: quando ele é unido com uma pessoa, ele acaba
// também "fazendo mais sentido". Quando dois ou mais objetos têm uma relação
// nesse sentido, nós temos uma agregação.

// **Cardinalidade**
// Quando temos uma relação entre objetos, nós podemos definir a cardinalidade
// deste relacionamento. Esta cardinalidade está relacionada à quantidade de
// elementos que estão envolvidos na relação, quer seja uma agregação, que seja
// uma composição.

public class Programa {
    public static void main(String[] args) {
        // Pois um gato está dentro do conjunto de animais (LSP).
        // Assim quando for preciso trocar de objeto herdado, a troca
        // será mais simples, como por exemplo somente a troca do código
        // "new Gato..." por "new Cachorro..."
        Animal animal = new Cachorro("Totó", 2);
        System.out.println("Olá, seu animal é " + animal.getEspecie() + ", o nome do " +
                "animal é " + animal.getNome() + " e ele tem " + animal.getIdade() + " anos.");
        if (animal.ehAdulto()) {
            System.out.println("Cachorro adulto");
        } else {
            System.out.println("Cachorro não é adulto");
        }
        System.out.println("==============");
        System.out.println("Barulho do Cachorro: ");
        animal.emitirBarulho();
        System.out.println("*****************");
        Zoologico zoo = new Zoologico();
        zoo.setNome("Zoo TreinaWeb");
        zoo.adicionarAnimal(animal);
        Animal animal2 = new Gato("Zé", 3);
        zoo.adicionarAnimal(animal2);
        System.out.println("Animais do zoológico " + zoo.getNome());
        zoo.listarAnimais();
        zoo.removerAnimal(0);
        System.out.println("Depois da remoção");
        zoo.listarAnimais();
        
        Veterinario vet = new Veterinario();
        vet.setNome("TreinaWeb");
        vet.atenderAnimal(animal);
        vet.listarAnimaisAtendidos();
    }
}
