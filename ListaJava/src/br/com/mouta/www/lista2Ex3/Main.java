/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista2Ex3;

import java.util.Scanner;

/**
 *
 * @author Micro
 */
public class Main {
    public static void main(String[] args) {
        Tabuada tab = new Tabuada();
        System.out.println("qual a opcão");
        int opcao = new Scanner(System.in).nextInt();
        tab.setOp(opcao);
        tab.Tabuada();
    }
}
