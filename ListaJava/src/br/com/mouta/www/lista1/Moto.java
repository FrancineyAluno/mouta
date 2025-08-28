/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista1;

/**
 *
 * @author Micro
 */
public class Moto extends Veiculo{
    private int cilindradas;

    public Moto() {
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibirDadosVeiculos() {
        System.out.println("===Dados da Moto===");
        System.out.println("Marca do moto "+getMarca());
        System.out.println("Modelo do moto "+getModelo());
        System.out.println("Ano do moto "+getAno());
        System.out.println("Cor do moto "+getCor());
        System.out.println("Tamanho da roda "+getnRodas());
        System.out.println("Cilindradas da moto "+getCilindradas());
    }
    
}
