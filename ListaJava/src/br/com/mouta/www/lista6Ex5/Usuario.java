/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista6Ex5;

/**
 *
 * @author Micro
 */
public class Usuario {
     private String nome;
    private String senha;

    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public boolean autenticar(String senhaInformada) {
        return this.senha.equals(senhaInformada);
    }

    public String getNome() {
        return nome;
    }
}
