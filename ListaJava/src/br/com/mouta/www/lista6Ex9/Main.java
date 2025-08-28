/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista6Ex9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Micro
 */
public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        ArrayList<Operacao> operacoes = new ArrayList<>();
        operacoes.add(new Soma());
        operacoes.add(new Subtracao());
        operacoes.add(new Multiplicacao());
        operacoes.add(new Divisao());

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("\nEscolha a operação:");
        for (int i = 0; i < operacoes.size(); i++) {
            System.out.println((i + 1) + " - " + operacoes.get(i).getNome());
        }

        System.out.print("Opção: ");
        int opcao = scanner.nextInt();

        try {
            Operacao op = operacoes.get(opcao - 1);
            double resultado = op.calcular(num1, num2);
            System.out.println("Resultado da " + op.getNome() + ": " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Operação inválida.");
        }
    }
}
