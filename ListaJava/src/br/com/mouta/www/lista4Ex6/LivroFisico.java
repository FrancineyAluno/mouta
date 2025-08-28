/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista4Ex6;

/**
 *
 * @author Micro
 */
public class LivroFisico extends Livro{
     private int paginas;

    public LivroFisico(String titulo, String autor, double preco, int paginas) {
        super(titulo, autor, preco);
        this.paginas = paginas;
    }

    public int getPaginas() {
        return paginas;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Livro físico: " + getTitulo() + " por " + getAutor() + ", " + paginas + " páginas, R$" + getPreco());
    }


}
