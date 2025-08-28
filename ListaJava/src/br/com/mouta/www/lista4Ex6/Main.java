/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista4Ex6;

/**
 *
 * @author Micro
 */
public class Main {
    public static void main(String[] args) {
        Livro fisico = new LivroFisico("O Senhor dos Anéis", "J.R.R. Tolkien", 89.90, 1200);
        Livro ebook = new Ebook("Clean Code", "Robert C. Martin", 59.90, "PDF", true);
        Livro audiobook = new Audiobook("Harry Potter", "J.K. Rowling", 39.90, 8.5);

        fisico.exibirDetalhes();
        ebook.exibirDetalhes();
        audiobook.exibirDetalhes();
    }
}
