/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista4Ex5;

/**
 *
 * @author Micro
 */
public class Main {
    public static void main(String[] args) {
        CarroEconomico economico = new CarroEconomico("Fiat Uno", 99.90);
        SUV suv = new SUV("Toyota RAV4", 199.90);
        VeiculoPremium premium = new VeiculoPremium("Mercedes-Benz S-Class", 499.90);

        economico.alugar();
        suv.alugar();
        premium.alugar();
    }


}
