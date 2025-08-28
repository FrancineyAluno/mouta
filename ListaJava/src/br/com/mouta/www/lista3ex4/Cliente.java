/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista3ex4;

import java.util.Scanner;

/**
 *
 * @author Micro
 */
public class Cliente extends Produto{
    private String nome;
    private String email;
    private String endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void fazerPedido(){
        System.out.println("O cliente comprou "+getMercadoria());  
    }
    public void exibirDados(){
        System.out.println("Nome do cliente "+getNome());
        System.out.println("Email do cliente "+getEmail());
        System.out.println("Endereço do Cliente "+getEndereco());
    }
}
