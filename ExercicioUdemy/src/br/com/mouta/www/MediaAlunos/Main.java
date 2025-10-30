/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.MediaAlunos;

import java.util.Scanner;

/**
 *
 * @author Micro
 */
public class Main {
    public static void main(String[] args) {
        MediaAlunos med = new MediaAlunos();
        float acum = 0;
        for(int i=1;i<4;i++){
            System.out.println("Qual o nome do aluno");
            String nome = new Scanner(System.in).nextLine();
            med.setNome(nome);
            
            System.out.println("Digite a primeira nota");
            float nota1 = new Scanner(System.in).nextFloat();
            med.setNota1(nota1);
            
            System.out.println("Digite a segunda nota");
            float nota2 = new Scanner(System.in).nextFloat();
            med.setNota2(nota2);
            
            med.setMediaAluno((nota1+nota2)/2);
            acum = (acum + (nota1+nota2)/2);
            System.out.println(acum);
            med.MediaAlunos();
        }
        System.out.println("A media da sala é de: "+acum/3);
    }
}
