/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista4Ex2;

/**
 *
 * @author Micro
 */
public class Cachorro extends Animal{
    private String porte;
    private String servico;

    public Cachorro() {
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }
    @Override
    public void exibirDados(){
        System.out.println("Nome do Cachooro"+getNome());
        System.out.println("Idade do Cachooro "+getIdade());
        System.out.println("Raça do Cachooro "+getRaca());
        System.out.println("Tamanho do Cachooro "+getPorte());
        System.out.println("Qual serviço no Cachooro "+getServico());
    }

    @Override
    public void emitirSom() {
        System.out.println("AuAu");
    }
    
}
