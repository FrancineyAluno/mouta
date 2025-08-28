/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista4Ex5;

/**
 *
 * @author Micro
 */
public class SUV extends Veiculo{
    public SUV(String modelo, double precoPorDia) {
        super(modelo, precoPorDia);
    }

    @Override
    public void alugar() {
        System.out.println("SUV alugado: " + getModelo() + " pelo valor de. "+getPrecoPorDia());
    }
}
