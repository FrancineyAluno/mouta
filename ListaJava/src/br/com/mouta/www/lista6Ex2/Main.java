/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista6Ex2;

import java.util.Scanner;

/**
 *
 * @author Micro
 */
public class Main {
     static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Operacao calc = new Operacao();

        int opcao;
        do {
            System.out.println("\n=== Calculadora ===");
            System.out.println("1. Somar dois números");
            System.out.println("2. Calcular área do círculo");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1 : {
                    System.out.print("Digite o primeiro número: ");
                    double n1 = Double.parseDouble(scanner.nextLine());
                    System.out.print("Digite o segundo número: ");
                    double n2 = Double.parseDouble(scanner.nextLine());
                    double resultado = calc.somar(n1, n2);
                    System.out.println("Resultado da soma: " + resultado);
                } break;
                case 2 : {
                    System.out.print("Digite o raio do círculo: ");
                    double raio = Double.parseDouble(scanner.nextLine());
                    double area = calc.calcularAreaCirculo(raio);
                    System.out.println("Área do círculo: " + area);
                } break;
                case 0 : System.out.println("Encerrando..."); break;
                default : System.out.println("Opção inválida!"); break;
            }
        } while (opcao != 0);
    }
}
