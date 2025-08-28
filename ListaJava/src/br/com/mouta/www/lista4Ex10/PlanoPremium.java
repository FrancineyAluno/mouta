/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista4Ex10;

/**
 *
 * @author Micro
 */
public class PlanoPremium extends PlanoAssinatura{
    public PlanoPremium() {
        super("Plano Premium", 99.90);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Plano Premium: Conteúdo em 4K e acesso antecipado por R$" + getPreco() + " ao mês.");
    }


}
