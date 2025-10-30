/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.Tabuada;

import java.util.Scanner;

/**
 *
 * @author Micro
 */
public class Main {
    public static void main(String[] args) {
        Tabuada tab = new Tabuada();
        
        System.out.println("Digite o valor da tabuada");
        int num = new Scanner(System.in).nextInt();
        tab.setNum(num);
        
        int op;
        System.out.println("Digite a opção da tabuada:\n");
        System.out.println("1 - Adição\n2 - Subtração\n3 - Multiplicação\n4 - Divisao");
        op = new Scanner(System.in).nextInt();
        
        switch(op){
            case 1:
                tab.tabuadaSoma();
            break;
            case 2:
                tab.tabuadaSubtracao();
            break;
            case 3:
                tab.tabuadaMultiplicacao();
            break;
            case 4:
                tab.tabuadaDivisao();
            break;
        }
    }
}
