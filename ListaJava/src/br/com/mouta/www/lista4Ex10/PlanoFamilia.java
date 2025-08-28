/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista4Ex10;

/**
 *
 * @author Micro
 */
public class PlanoFamilia extends PlanoAssinatura{
     private int numUsuarios; 
    public PlanoFamilia() {
        super("Plano Família", 59.90);
        this.numUsuarios = 4;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Plano Família: Acesso para até " + numUsuarios + " usuários por R$" + getPreco() + " ao mês.");
    }
}
