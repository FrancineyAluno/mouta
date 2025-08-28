/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista4Ex8;

/**
 *
 * @author Micro
 */
public abstract class PacoteViagem {
    private String destino;
    private double preco;
    
    public PacoteViagem(String destino, double preco) {
        this.destino = destino;
        this.preco = preco;
    }

    public String getDestino() {
        return destino;
    }

    public double getPreco() {
        return preco;
    }

    public abstract void exibirDetalhes();
}
