/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista4Ex1;

/**
 *
 * @author Micro
 */
public class Smartphone extends Eletronico{
    private int ram;
    private int interno;
    private int sdCard;
    private String cpu;
    private String operacional;
    //contrutor vzzio
    public Smartphone(){    
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getInterno() {
        return interno;
    }

    public void setInterno(int interno) {
        this.interno = interno;
    }

    public int getSdCard() {
        return sdCard;
    }

    public void setSdCard(int sdCard) {
        this.sdCard = sdCard;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getOperacional() {
        return operacional;
    }

    public void setOperacional(String operacional) {
        this.operacional = operacional;
    }
    
    
    
    @Override
    public void exibirDados() {
        System.out.println("O nome do smartphone é "+getTipoEletronico());
        System.out.println("A marca do smartphone é "+getMarca());
        System.out.println("O modelo do smartphone é "+getModelo());
        System.out.println("O ano do smartphone é "+getAno());
        System.out.println("A memória ram do smartphome é "+getRam());
        System.out.println("A memória interna do smartphone é "+getInterno());
        System.out.println("O cartão Sd pode ser de até "+getSdCard());
        System.out.println("O chip set de processamento é "+getCpu());
        System.out.println("O sistema Opecional do smartphone é "+getOperacional());
    }
}
