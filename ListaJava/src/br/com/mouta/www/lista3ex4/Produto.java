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
public class Produto {
    private String nomeProduto;
    private float preco;
    private int quantEstoque;
    private int mercadoria;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQuantEstoque() {
        return quantEstoque;
    }
    
    public void setQuantEstoque(int quantEstoque) {
        this.quantEstoque = quantEstoque;
    }

    public int getMercadoria() {
        return mercadoria;
    }

    public void setMercadoria(int mercadoria) {
        this.mercadoria = mercadoria;
    }
    
    public void comprar() {
        int quantidade;
        quantidade = quantEstoque - mercadoria;
        System.out.println("Ainda tem em estoque "+quantidade);
    }

    public void exibirDetalhes() {
        System.out.println("Nome do produto "+getNomeProduto());
        System.out.println("Preço do produto "+getPreco());
        System.out.println("Quantidade em estoque "+getQuantEstoque());
    }
}

