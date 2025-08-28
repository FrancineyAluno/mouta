/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista4Ex8;

/**
 *
 * @author Micro
 */
public class PacoteLuxo extends PacoteViagem{
    public PacoteLuxo(String destino, double preco) {
        super(destino, preco);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Pacote Luxo para " + getDestino() + ": traslado privativo e serviços exclusivos por R$" + getPreco());
    }
}
