/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.MaiorMenor;

import java.util.Scanner;

/**
 *
 * @author Micro
 */
public class Main {
    public static void main(String[] args) {
        MaiorMenor escolha = new MaiorMenor();
        
        System.out.println("Digite os valores positivos");
        int num = new Scanner(System.in).nextInt();
        escolha.setNum(num);
        
        escolha.exibirMaiorMenor();
    }
}
