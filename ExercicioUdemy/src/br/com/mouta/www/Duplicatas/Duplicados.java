/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.Duplicatas;

import java.util.Scanner;

/**
 *
 * @author Micro
 */
public class Duplicados {
    int[] numeros = new int[10];
    int i,j;
            
    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }
    public void verDuplicados(){
        System.out.println("Digite os valores para verificação");
        for(i=0;i < numeros.length;i++){
            numeros[i] = new Scanner(System.in).nextInt();
            setNumeros(numeros);
        }
        for(i=0;i<numeros.length-1;i++){
            for(j=i+1;j<numeros.length;j++){
                if(numeros[i] == numeros[j]){
                    System.out.println("Esses se repetem "+ getNumeros()[j]);
                }
            }
        }
    }  
}
