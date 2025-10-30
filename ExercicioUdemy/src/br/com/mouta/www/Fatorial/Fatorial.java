/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.Fatorial;

/**
 *
 * @author Micro
 */
public class Fatorial {
    int num,acum=1;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getAcum() {
        return acum;
    }

    public void setAcum(int acum) {
        this.acum = acum;
    }
    
    public void fatorial(){
        for(int i=num;i>0;i--){
            acum = acum*i;
        }
        System.out.println("O fatorial de "+getNum()+" é "+getAcum());
    }
}
