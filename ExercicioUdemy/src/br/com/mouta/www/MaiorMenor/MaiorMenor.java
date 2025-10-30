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
public class MaiorMenor {
    private int num,maior=0,menor=9999;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getMaior() {
        return maior;
    }

    public void setMaior(int maior) {
        this.maior = maior;
    }

    public int getMenor() {
        return menor;
    }

    public void setMenor(int menor) {
        this.menor = menor;
    }
    public void exibirMaiorMenor(){
        
        while(num >0){
            if(num >maior){
                maior = num;
            }
            if(num < menor){
                menor = num;
            }
            System.out.println("Digite os valores positivos");
            num = new Scanner(System.in).nextInt();
            setNum(num);
        }
        System.out.println("O maior é "+getMaior());
        System.out.println("O menor é "+getMenor());
    }
}
