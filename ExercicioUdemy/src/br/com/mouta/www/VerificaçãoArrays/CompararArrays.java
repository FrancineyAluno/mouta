/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.VerificaçãoArrays;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Micro
 */
public class CompararArrays {
    private String[] palavras1 = new String[4];
    private String[] palavras2 = new String[4];
    int i,j;

    public String[] getPalavras1() {
        return palavras1;
    }

    public void setPalavras1(String[] palavras1) {
        this.palavras1 = palavras1;
    }

    public String[] getPalavras2() {
        return palavras2;
    }

    public void setPalavras2(String[] palavras2) {
        this.palavras2 = palavras2;
    }
    public void exibirComparacao(){
        System.out.println("Digite as primeiras palavras do primeiro array");
        for(i=0;i<palavras1.length;i++){
            palavras1[i] = new Scanner(System.in).nextLine();
            setPalavras1(palavras1);
        }
        
        System.out.println("Digite as primeiras palavras do primeiro array");
        for(j=0;j<palavras2.length;j++){
            palavras2[j] = new Scanner(System.in).nextLine();
            setPalavras2(palavras2);
            
        }
         HashSet<String> exclusivo = new HashSet<>();
        for(i=0;i<=palavras1.length-1;i++){
            for(j=0;j<=palavras2.length-1;j++){
                if(palavras1[i].equals(palavras2[j])){
                    exclusivo.add(palavras1[i]);
                }
            }
        }
        System.out.println("Repetidos "+exclusivo);
    }
}
