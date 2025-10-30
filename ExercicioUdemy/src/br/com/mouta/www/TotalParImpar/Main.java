/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.TotalParImpar;

import java.util.Scanner;

/**
 *
 * @author Micro
 */
public class Main {
    public static void main(String[] args) {
        TotalParImpar total = new TotalParImpar();
        
        System.out.println("Digite os valores positivos");
        int num = new Scanner(System.in).nextInt();
        total.setNum(num);
        
            total.ParImpar();
    }
}
