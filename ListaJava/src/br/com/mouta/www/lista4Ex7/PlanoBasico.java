/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista4Ex7;

/**
 *
 * @author Micro
 */
public class PlanoBasico extends PlanoTreino{
    public PlanoBasico() {
        super("Plano Básico", 99.90);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Plano Básico: Acesso à musculação por R$" + getPrecoMensal() + " ao mês.");
    }
}
