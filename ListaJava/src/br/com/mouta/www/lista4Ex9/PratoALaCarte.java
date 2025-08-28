/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista4Ex9;

/**
 *
 * @author Micro
 */
public class PratoALaCarte extends ItemMenu{
    private String descricao;

    public PratoALaCarte(String nome, double preco, String descricao) {
        super(nome, preco);
        this.descricao = descricao;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Prato à la carte: " + getNome() + " - " + descricao + " por R$" + getPreco());
    }
}
