/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.PositivoNegativo;

import java.util.Scanner;

/**
 *
 * @author Micro
 */
public class PositivoNegativo {
    int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    public void verNegativoPositivo(){
        do{
            System.out.println("Digite um valor positivo ou negativo ou 0 para finalizar");
            num = new Scanner(System.in).nextInt();
            setNum(num);
            
            if(num > 0){
                System.out.println("Positivo");
            }else if(num < 0){
                System.out.println("Negativo");
            }else{
                System.out.println("Finalizando");
            }
            
        }while(getNum()!=0);
    }
}
