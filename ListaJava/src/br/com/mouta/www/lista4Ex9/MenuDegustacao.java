/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista4Ex9;

/**
 *
 * @author Micro
 */
public class MenuDegustacao extends ItemMenu{
    private String experienciaGastronomica;

    public MenuDegustacao(String nome, double preco, String experienciaGastronomica) {
        super(nome, preco);
        this.experienciaGastronomica = experienciaGastronomica;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Menu degustação: " + getNome() + " - " + experienciaGastronomica + " por R$" + getPreco());
    }
}
