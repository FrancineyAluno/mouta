/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista4Ex8;

/**
 *
 * @author Micro
 */
public class PacoteEconomico extends PacoteViagem{
    public PacoteEconomico(String destino, double preco) {
        super(destino, preco);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Pacote Econômico para " + getDestino() + ": hospedagem simples por R$" + getPreco());
    }
}
