/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista2Ex2;

/**
 *
 * @author Micro
 */
public class parImpar {
    private int res;

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }
    public void parImpar(){
        res++;
        if(res%2==0){
            System.out.println("Par");
            System.out.println(" "+getRes());
        }else{
            System.out.println("\tImpar");
            System.out.println("\t"+getRes());
        }
    }
}
