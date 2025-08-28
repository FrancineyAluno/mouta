/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista4Ex1;

/**
 *
 * @author Micro
 */
public class Notebook extends Eletronico{
    private int ram;
    private String tipoArmazenamento;
    private int interno;
    private String processador;
    private String Gercao;
    private String operacional;
    
    public Notebook(){
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getTipoArmazenamento() {
        return tipoArmazenamento;
    }

    public void setTipoArmazenamento(String tipoArmazenamento) {
        this.tipoArmazenamento = tipoArmazenamento;
    }

    public int getInterno() {
        return interno;
    }

    public void setInterno(int interno) {
        this.interno = interno;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getGercao() {
        return Gercao;
    }

    public void setGercao(String Gercao) {
        this.Gercao = Gercao;
    }

    public String getOperacional() {
        return operacional;
    }

    public void setOperacional(String operacional) {
        this.operacional = operacional;
    }
    
    

    @Override
    public void exibirDados() {
        System.out.println("O nome do notebook é "+getTipoEletronico());
        System.out.println("A marca do notebook é "+getMarca());
        System.out.println("O modelo do notebook é "+getModelo());
        System.out.println("O ano do notebook é "+getAno());
        System.out.println("A memória ram do notebook é "+getRam());
        System.out.println("O tipo de armarzenamento do notebook é "+getTipoArmazenamento());
        System.out.println("A memória interna do notebook é "+getInterno());
        System.out.println("O processador do notebook é um "+getProcessador());
        System.out.println("A geração do notebook é "+getGercao());
        System.out.println("O sitema opercional do notebook é "+getOperacional());
    }
    
    
}
