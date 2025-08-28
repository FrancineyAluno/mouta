/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista4Ex7;

/**
 *
 * @author Micro
 */
public class Main {
    public static void main(String[] args) {
        PlanoBasico basico = new PlanoBasico();
        PlanoIntermediario intermediario = new PlanoIntermediario();
        PlanoPremium premium = new PlanoPremium();

        basico.exibirDetalhes();
        intermediario.exibirDetalhes();
        premium.exibirDetalhes();
    }
}
