/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista4Ex8;

/**
 *
 * @author Micro
 */
public class Main {
    public static void main(String[] args) {
        PacoteEconomico economico = new PacoteEconomico("Rio de Janeiro", 1499.90);
        PacoteTuristico turistico = new PacoteTuristico("Paris", 4999.90);
        PacoteLuxo luxo = new PacoteLuxo("Dubai", 9999.90);

        economico.exibirDetalhes();
        turistico.exibirDetalhes();
        luxo.exibirDetalhes();
    }
}
