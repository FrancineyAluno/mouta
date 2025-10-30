/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.mouta.www.ParImpar;

import java.util.Scanner;

/**
 *
 * @author Micro
 */
public class Main {

    public static void main(String[] args) {
        parOuImpar par = new parOuImpar();
        System.out.println("Digite um valor para verificação");
        int num = new Scanner(System.in).nextInt();
        par.setNum1(num);
        
        if(num%2==0){
            par.setpI("par");
        }else{
            par.setpI("Impar");
        }
        par.parImpar();
    }
}
