/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista4Ex2;

/**
 *
 * @author Micro
 */
public class Passaro extends Animal{
    
    private String servico;

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public Passaro(){
    }

    @Override
    public void emitirSom(){
        System.out.println("priprori");
    }

    @Override
    public void exibirDados(){
        System.out.println("Nome do Pássaro "+getNome());
        System.out.println("Idade do Pássaro "+getIdade());
        System.out.println("Raça do Pássaro "+getRaca());
        System.out.println("Qual serviço no Pássaro "+getServico());
    }
    
}
