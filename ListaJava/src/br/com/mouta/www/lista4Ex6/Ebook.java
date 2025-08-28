/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista4Ex6;

/**
 *
 * @author Micro
 */
public class Ebook extends Livro{
    private String formato;
    private boolean suporteAudio;

    public Ebook(String titulo, String autor, double preco, String formato, boolean suporteAudio) {
        super(titulo, autor, preco);
        this.formato = formato;
        this.suporteAudio = suporteAudio;
    }

    public String getFormato() {
        return formato;
    }

    public boolean temSuporteAudio() {
        return suporteAudio;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("E-book: " + getTitulo() + " por " + getAutor() + ", formato " + formato + ", suporte a áudio: " + (suporteAudio ? "Sim" : "Não") + ", R$" + getPreco());
    }
}
