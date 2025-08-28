/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista4Ex7;

/**
 *
 * @author Micro
 */
public abstract class PlanoTreino {
      private String nome;
    private double precoMensal;

    public PlanoTreino(String nome, double precoMensal) {
        this.nome = nome;
        this.precoMensal = precoMensal;
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoMensal() {
        return precoMensal;
    }

    public abstract void exibirDetalhes();
}
