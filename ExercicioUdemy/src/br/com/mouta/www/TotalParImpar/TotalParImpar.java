/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.TotalParImpar;

import java.util.Scanner;

/**
 *
 * @author Micro
 */
public class TotalParImpar {
    private int num,cont1=0,cont2=0;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getCont1() {
        return cont1;
    }

    public void setCont1(int cont1) {
        this.cont1 = cont1;
    }

    public int getCont2() {
        return cont2;
    }

    public void setCont2(int cont2) {
        this.cont2 = cont2;
    }
    
    public void ParImpar(){
        while(num >0){
            if(num%2==0){
                cont1++;
            }else{
                cont2++;
            }
            System.out.println("Digite os valores positivos");
            num = new Scanner(System.in).nextInt();
            setNum(num);
        }
        System.out.println("Os pares são "+getCont1());
        System.out.println("Os impares são "+getCont2());
    }
}
