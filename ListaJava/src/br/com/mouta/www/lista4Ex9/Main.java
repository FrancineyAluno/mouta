/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista4Ex9;

/**
 *
 * @author Micro
 */
public class Main {
    public static void main(String[] args) {
        PratoALaCarte prato = new PratoALaCarte("Filé ao molho madeira", 49.90, "Delicioso filé servido com molho especial e acompanhamentos.");
        ComboPromocional combo = new ComboPromocional("Combo Executivo", 79.90, 10.00);
        MenuDegustacao degustacao = new MenuDegustacao("Menu Gourmet", 159.90, "Sequência especial de pratos assinados pelo chef.");

        prato.exibirDetalhes();
        combo.exibirDetalhes();
        degustacao.exibirDetalhes();
    }


}
