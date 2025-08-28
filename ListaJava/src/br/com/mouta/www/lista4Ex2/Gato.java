/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista4Ex2;

/**
 *
 * @author Micro
 */
public class Gato extends Animal{
   private String servico;

    public Gato() {
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }
   

    @Override
    public void emitirSom() {
        System.out.println("miau");
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome do Gato "+getNome());
        System.out.println("Idade do Gato "+getIdade());
        System.out.println("Raça do Gato "+getRaca());
        System.out.println("Qual serviço no Gato "+getServico());
    }
    
}
