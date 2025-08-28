/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista4Ex10;

/**
 *
 * @author Micro
 */
public class PlanoBasico extends PlanoAssinatura{
    public PlanoBasico() {
        super("Plano Básico", 29.90);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Plano Básico: Acesso a filmes em qualidade padrão por R$" + getPreco() + " ao mês.");
    }
}
