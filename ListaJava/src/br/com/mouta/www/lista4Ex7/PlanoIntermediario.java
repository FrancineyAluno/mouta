/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista4Ex7;

/**
 *
 * @author Micro
 */
public class PlanoIntermediario extends PlanoTreino{
    public PlanoIntermediario() {
        super("Plano Intermediário", 149.90);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Plano Intermediário: Musculação + aulas em grupo por R$" + getPrecoMensal() + " ao mês.");
    }
}
