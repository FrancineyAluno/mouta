/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista4Ex7;

/**
 *
 * @author Micro
 */
public class PlanoPremium extends PlanoTreino{
     public PlanoPremium() {
        super("Plano Premium", 299.90);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Plano Premium: Personal trainer + nutrição exclusiva por R$" + getPrecoMensal() + " ao mês.");
    }
}
