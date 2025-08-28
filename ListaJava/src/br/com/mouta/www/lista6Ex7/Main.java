/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista6Ex7;

import java.util.Scanner;

/**
 *
 * @author Micro
 */
public class Main {
    public static void main(String[] args) {
        Manipulacao mudar = new Manipulacao();
        
        System.out.println("Digite o texto a ser manipulado");
        String texto = new Scanner(System.in).nextLine();
        mudar.setTexto(texto);
        
        mudar.exibirResultado();
    }
}
