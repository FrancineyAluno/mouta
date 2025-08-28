/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista3ex4;

import java.util.Scanner;

/**
 *
 * @author Micro
 */
public class Main {
    public static void main(String[] args) {
        
        Produto prod = new Produto();
        Cliente cli = new Cliente();
        
        System.out.println("Digite o nome do produto");
        String nome = new Scanner(System.in).nextLine();
        prod.setNomeProduto(nome);
        System.out.println("Quanto em estoque");
        int estoque = new Scanner(System.in).nextInt();
        prod.setQuantEstoque(estoque);
        System.out.println("Preço do produto");
        float preco = new Scanner(System.in).nextFloat();
        prod.setPreco(preco);
        System.out.println("Quantos o cliente comprou");
        int compra = new Scanner(System.in).nextInt();
        prod.setMercadoria(compra);
        
        
        prod.exibirDetalhes();
        cli.fazerPedido();
        prod.comprar();
    }
}
