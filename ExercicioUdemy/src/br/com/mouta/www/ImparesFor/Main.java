/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.ImparesFor;

import java.util.Scanner;

/**
 *
 * @author Micro
 */
public class Main {
    public static void main(String[] args) {
        Impares_For impar = new Impares_For();
        
        System.out.println("Digite o valor para verificação");
        int num = new Scanner(System.in).nextInt();
        impar.setNum(num);
        
        impar.imprimirImpar();
    }
}
