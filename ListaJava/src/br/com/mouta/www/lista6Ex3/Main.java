/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista6Ex3;

import java.util.Scanner;

/**
 *
 * @author Micro
 */
public class Main {
     static Scanner scanner = new Scanner(System.in);
    public static void main(String args[]){
        System.out.println("=== Cálculo de Área e Perímetro ===");
        System.out.print("Digite a largura do retângulo: ");
        double largura = Double.parseDouble(scanner.nextLine());

        System.out.print("Digite a altura do retângulo: ");
        double altura = Double.parseDouble(scanner.nextLine());

        Retangulo retangulo = new Retangulo(largura, altura);

        System.out.println("\n" + retangulo);
        System.out.println("Área: " + retangulo.calcularArea());
        System.out.println("Perímetro: " + retangulo.calcularPerimetro());
    }
}
