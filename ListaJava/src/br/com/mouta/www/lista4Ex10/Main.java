/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista4Ex10;

/**
 *
 * @author Micro
 */
public class Main {
     public static void main(String[] args) {
        PlanoBasico basico = new PlanoBasico();
        PlanoFamilia familia = new PlanoFamilia();
        PlanoPremium premium = new PlanoPremium();

        basico.exibirDetalhes();
        familia.exibirDetalhes();
        premium.exibirDetalhes();
    }
}
