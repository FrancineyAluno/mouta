/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.Calculadora;

import java.util.Scanner;

/**
 *
 * @author Micro
 */
public class Main {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        
        System.out.println("Digite o primeiro valor");
        int num1 = new Scanner(System.in).nextInt();
        cal.setNum1(num1);
        
        System.out.println("Digite o segundo valor");
        int num2 = new Scanner(System.in).nextInt();
        cal.setNum2(num2);
        System.out.println("Digite a opção da operação\n1 - Adição\n2 - Subtração\n3 - Multiplicação\n4 - Divisão");
        int op = new Scanner(System.in).nextInt();
        switch(op){
            case 1:
                cal.setRes(num1+num2);
                cal.Calculadora();
            break;
            case 2:
                if(num1 > num2){
                    cal.setRes(num1 - num2);
                    cal.Calculadora();
                }else if(num1 < num2){
                    cal.setRes(num2 - num1);
                    cal.Calculadora();
                }
            break;
            case 3:
                cal.setRes(num1*num2);
                cal.Calculadora();
            break;
            case 4:
                if(num2>0){
                    cal.setRes(num1/num2);
                    cal.Calculadora();
                }else{
                    System.out.println("Nao existe essa divisão");
                }
            
        }
    }
}
