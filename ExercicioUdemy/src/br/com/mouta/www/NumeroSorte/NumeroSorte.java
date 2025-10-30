/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.NumeroSorte;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Micro
 */
public class NumeroSorte {
    Random sorte = new Random();
    boolean acertou = false;
    private int palpite=0,tentativas=0,num;

    public int getPalpite() {
        return palpite;
    }

    public void setPalpite(int palpite) {
        this.palpite = palpite;
    }

    public int getTentativas() {
        return tentativas;
    }

    public void setTentativas(int tentativas) {
        this.tentativas = tentativas;
    }
    public void exibirSorteio(){
        num = sorte.nextInt(101);
        
        while(acertou == false){
            System.out.println("Digite um valor entre 0 - 100 para ver se você acerta");
            palpite = new Scanner(System.in).nextInt();
            setPalpite(palpite);
            tentativas++;
            if(palpite == num){
                acertou = true;
                System.out.println("Voçê acertou em "+tentativas+" tentativas");
            }else if(palpite > num){
                System.out.println("Mais baixo");
            }else{
                System.err.println("Mais alto");
            }
        }
    }
}
