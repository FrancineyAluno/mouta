/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista6Ex3;

/**
 *
 * @author Micro
 */
public class Retangulo extends FormaGeometrica{
     private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }

    @Override
    public String toString() {
        return String.format("Retângulo:\nlargura = %.2f\naltura = %.2f", largura, altura);
    }
}
