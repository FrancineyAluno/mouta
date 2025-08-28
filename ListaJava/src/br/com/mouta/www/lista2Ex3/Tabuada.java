/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista2Ex3;

/**
 *
 * @author Micro
 */
public class Tabuada {
    private int op;
    private int res;

    public int getOp() {
        return op;
    }

    public void setOp(int op) {
        this.op = op;
    }

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }
    
     public void Tabuada(){
         getOp();
         int i=0,j=0;
         switch(op){
             case 1:
                  for(i=1;i<=10;i++){
                    for(j=1;j<=10;j++){
                        res = i+j;
                        System.out.println(i+"+"+j+"="+getRes());
                    }
                      System.out.println("\n");
                 }
             break;
             case 2:
                for(i=1;i<=10;i++){
                    for(j=1;j<=10;j++){
                        res = i+j;
                        System.out.println(getRes()+"-"+i+"="+j);
                    }
                    System.out.println("\n");
                }
                 
             break;
             case 3:
                for(i=1;i<=10;i++){
                    for(j=1;j<=10;j++){
                        res = i*j;
                        System.out.println(i+"x"+j+"="+getRes());
                    }
                    System.out.println("\n");
                }
             break;
             case 4:
                for(i=1;i<=10;i++){
                    for(j=1;j<=10;j++){
                        res = i*j;
                        System.out.println(getRes()+":"+i+"="+j);
                    }
                    System.out.println("\n");
                }
             break;
         }
     }
}
