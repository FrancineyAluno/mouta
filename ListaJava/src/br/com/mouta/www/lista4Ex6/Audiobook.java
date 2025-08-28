/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista4Ex6;

/**
 *
 * @author Micro
 */
public class Audiobook extends Livro{
    private double duracaoHoras;

    public Audiobook(String titulo, String autor, double preco, double duracaoHoras) {
        super(titulo, autor, preco);
        this.duracaoHoras = duracaoHoras;
    }

    public double getDuracaoHoras() {
        return duracaoHoras;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Audiobook: " + getTitulo() + " por " + getAutor() + ", duração de " + duracaoHoras + " horas, R$" + getPreco());
    }
}
