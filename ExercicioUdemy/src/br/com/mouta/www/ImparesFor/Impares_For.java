/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.ImparesFor;

/**
 *
 * @author Micro
 */
public class Impares_For {
    int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    public void imprimirImpar(){
        for(int i=0;i<getNum();i++){
            if(i%2!=0){
                System.out.println("Os impares são "+i);
            }
        }
    }
}
