/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista4Ex9;

/**
 *
 * @author Micro
 */
public class ComboPromocional extends ItemMenu{
     private double desconto;

    public ComboPromocional(String nome, double preco, double desconto) {
        super(nome, preco);
        this.desconto = desconto;
    }

    public double getPrecoComDesconto() {
        return getPreco() - desconto;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Combo promocional: " + getNome() + " por R$" + getPrecoComDesconto() + " (desconto de R$" + desconto + ")");
    }
}
