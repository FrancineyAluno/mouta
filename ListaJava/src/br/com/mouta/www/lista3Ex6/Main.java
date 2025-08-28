/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista3Ex6;

import java.util.Scanner;

/**
 *
 * @author Micro
 */
public class Main {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        //ContaPoupanca conta = new ContaPoupanca();
        System.out.println("Digite o nome do Banco");
        String banco = new Scanner(System.in).nextLine();
        conta.setBanco(banco);
        System.out.println("Numero da Agrncia");
        int agencia = new Scanner(System.in).nextInt();
        conta.setNumAgencia(agencia);
        conta.setNomeCliente("Franciney");
        System.out.println("Numero da Conta Coreente");
        int cc = new Scanner(System.in).nextInt();
        conta.setNumConta(cc);
        System.out.println("Valor do Deposito");
        float dep = new Scanner(System.in).nextFloat();
        conta.setDeposito(dep);
        System.out.println("Valor do saque");
        float saque = new Scanner(System.in).nextFloat();
        conta.setSaque(saque);
        
        conta.verConta();
    }
}
