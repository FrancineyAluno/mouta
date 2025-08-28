/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista4Ex5;

/**
 *
 * @author Micro
 */
public class CarroEconomico extends Veiculo{
    public CarroEconomico(String modelo, double precoPorDia) {
        super(modelo, precoPorDia);
    }

    @Override
    public void alugar() {
        System.out.println("Carro econômico alugado: " + getModelo() + " por R$" + getPrecoPorDia() + " ao dia.");
    }
}
