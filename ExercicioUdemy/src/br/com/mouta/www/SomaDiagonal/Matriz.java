/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.SomaDiagonal;

import java.util.Scanner;

/**
 *
 * @author Micro
 */
public class Matriz {
    private int[][] num = new int[3][3];
    private int i,j,acum;

    public int[][] getNum() {
        return num;
    }

    public void setNum(int[][] num) {
        this.num = num;
    }
    
    public void dadosMatriz(){
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.println("Digite linha "+(i+1)+" e coluna "+(j+1));
                num[i][j] = new Scanner(System.in).nextInt();
                setNum(num);
            }
        }
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                if(i==j){
                    System.out.print(num[i][j]+" ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                if(i==j){
                    acum +=num[i][j];
                }
            }
        }
        System.out.println("Valor da soma da diagonal é "+acum);
    }
}
