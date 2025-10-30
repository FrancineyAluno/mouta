/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.Fatorial;

import java.util.Scanner;

/**
 *
 * @author Micro
 */
public class Main {
    public static void main(String[] args) {
        Fatorial fat = new Fatorial();
        
        System.out.println("Digite o valor positivo");
        int num = new Scanner(System.in).nextInt();
        fat.setNum(num);
        
        fat.fatorial();
    }
}
