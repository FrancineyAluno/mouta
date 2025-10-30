/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.Diferenca;

import java.util.Scanner;

/**
 *
 * @author Micro
 */
public class Main {
    public static void main(String[] args) {
        Diferenca dif = new Diferenca();
        System.out.println("Digite o primeiro valor");
        int num1 = new Scanner(System.in).nextInt();
        dif.setNum1(num1);
        
        System.out.println("Digite o segundo valor");
        int num2 = new Scanner(System.in).nextInt();
        dif.setNum2(num2);
        
        if(num1 > num2){
            dif.setRes(num1 - num2);
            dif.Diferenca();
        }else if(num1 < num2){
            dif.setRes(num2 - num1);
            dif.Diferenca();
        }else{
            dif.Diferenca();
        }
        
    }
}
