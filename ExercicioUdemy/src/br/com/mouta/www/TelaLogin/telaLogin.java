/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.TelaLogin;

/**
 *
 * @author Micro
 */
public class telaLogin {
    String nome;
    int senha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
    public void Login(){
        if(getNome().equals("Roger") || getNome().equals("roger")|| getNome().equals("ROGER") && getSenha()==123){
            System.out.println("Logado com sucesso");
        }else{
            System.out.println("Login ou senha inválidos");
        }
    }
}
