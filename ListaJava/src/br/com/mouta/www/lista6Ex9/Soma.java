/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista6Ex9;

/**
 *
 * @author Micro
 */
public class Soma extends Operacao{
    public double calcular(double a, double b) {
        return a + b;
    }

    @Override
    public String getNome() {
        return "Soma";
    }
}
