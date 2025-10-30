/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.Tabuada;

/**
 *
 * @author Micro
 */
public class Tabuada {
    int num,res=0;
    

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    public void tabuadaSoma(){
        for(int i=1;i<=10;i++){
            System.out.println(num+"+"+i+"="+num+i);
        }
    }
    public void tabuadaSubtracao(){
        for(int i=1;i<=10;i++){
            System.out.println(num+i+"-"+num+"="+i);
        }
    }
    public void tabuadaMultiplicacao(){
        for(int i=1;i<=10;i++){
            System.out.println(num+"x"+i+"="+(num*i));
        }
    }
    public void tabuadaDivisao(){
        for(int i=1;i<=10;i++){
            System.out.println(num*i+":"+num+"="+i);
        }
    }
}
