/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.Ordenar;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Micro
 */
public class OrdenarCrescente {
    
    int[] numeros = new int[5];

    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }
    
    public void Ordenacao(){
        for(int i=0;i<numeros.length;i++){
            System.out.println("Digite o "+(i+1)+" valor");
            numeros[i] = new Scanner(System.in).nextInt();
            setNumeros(numeros);     
        }
        System.out.println("Os valores digitados foram ");
        for(int i : numeros){
            System.out.println(i);
        }
        
        Arrays.sort(numeros);
        System.out.println("Os valores Ordenados ");
        for(int i : numeros){
            System.out.println(i);
        }
    }
}
