/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista6Ex4;

/**
 *
 * @author Micro
 */
public class Livro {
     private String titulo;
    private String autor;
    private Categoria categoria; // categoria fixa, definida pelo enum

    public Livro(String titulo, String autor, Categoria categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return String.format("Título: %s\nAutor: %s\nCategoria: %s", titulo, autor, categoria);
    }
}
