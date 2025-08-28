/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista6Ex4;

import java.util.Scanner;

/**
 *
 * @author Micro
 */
public class Main {
     static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Digite o título do livro:");
        String titulo = scanner.nextLine();

        System.out.println("Digite o autor do livro:");
        String autor = scanner.nextLine();

        System.out.println("Escolha a categoria:");
        for (Categoria c : Categoria.values()) {
            System.out.println("- " + c);
        }

        Categoria categoria = null;
        while (categoria == null) {
            try {
                System.out.print("Digite exatamente como mostrado: ");
                String entrada = scanner.nextLine().toUpperCase();
                categoria = Categoria.valueOf(entrada);
            } catch (IllegalArgumentException e) {
                System.out.println("Categoria inválida. Tente novamente.");
            }
        }

        Livro livro = new Livro(titulo, autor, categoria);
        System.out.println("\nLivro cadastrado com sucesso:\n" + livro);
    }
}
