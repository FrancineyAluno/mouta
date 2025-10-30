/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.Finalizar;

import java.util.Scanner;

/**
 *
 * @author Micro
 */
public class Finalizar {
    private int num=0;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    public void numerosDigitados(){
        do{
            System.out.println("digite os valores ");
            num = new Scanner(System.in).nextInt();
            setNum(num);
        }while(getNum()<1 || getNum()>5);
    }
}
