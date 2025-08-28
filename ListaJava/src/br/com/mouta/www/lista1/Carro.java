/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista1;

/**
 *
 * @author Micro
 */
public class Carro extends Veiculo{
    private String portencias;
    private String categoria;
    private int portas;

    public Carro(){
    }

    public String getPortencias() {
        return portencias;
    }
    public void setPortencias(String portencias) {
        this.portencias = portencias;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public int getPortas() {
        return portas;
    }
    public void setPortas(int portas) {
        this.portas = portas;
    }
 
    @Override
    public void exibirDadosVeiculos() {
        System.out.println("===Dados do Carro===");
        System.out.println("Marca do carro "+getMarca());
        System.out.println("Modelo do carro "+getModelo());
        System.out.println("Ano do carro "+getAno());
        System.out.println("Cor do carr "+getCor());
        System.out.println("Tamanho da roda "+getnRodas());
        System.out.println("Potencia do carro "+getPortencias());
        System.out.println("Números de portas "+getPortas());
    }
}
