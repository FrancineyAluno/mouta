/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista4Ex1;

/**
 *
 * @author Micro
 */
public class Smartwach extends Eletronico{
    private String recLigacao;
    private int memoria;
    private String sistema;
    private int ram;

    public String getRecLigacao() {
        return recLigacao;
    }

    public void setRecLigacao(String recLigacao) {
        this.recLigacao = recLigacao;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public void exibirDados() {
        System.out.println("O nome do smartwatch é "+getTipoEletronico());
        System.out.println("A marca do smartwatch é "+getMarca());
        System.out.println("O modelo do smartwatch é "+getModelo());
        System.out.println("O ano do smartwatch é "+getAno());
        System.out.println("A memória ram do smartwatch é "+getRam());
        System.out.println("A memória interna do smartwatch é "+getMemoria());
        System.out.println("O smartwatch recebe ligação? "+getRecLigacao());
        System.out.println("O Sistema opracional do smartwatch é "+getSistema());
    }
    
    
}
