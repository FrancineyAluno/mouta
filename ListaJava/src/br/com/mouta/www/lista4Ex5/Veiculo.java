/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista4Ex5;

/**
 *
 * @author Micro
 */
public abstract class Veiculo {
    private String modelo;
    private double precoPorDia;

    public Veiculo(String modelo, double precoPorDia) {
        this.modelo = modelo;
        this.precoPorDia = precoPorDia;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecoPorDia() {
        return precoPorDia;
    }
    
    public abstract void alugar();
}