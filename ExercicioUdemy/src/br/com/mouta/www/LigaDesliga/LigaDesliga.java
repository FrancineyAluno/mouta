/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.LigaDesliga;

/**
 *
 * @author Micro
 */
public class LigaDesliga {
    private boolean liga = false;
    
    public void liga(){
        if(liga == true){
            System.out.println("Ja está em uma ligaçao");
        }else{
            liga = true;
            System.out.println("Ligação aberta");
        }
    }
    public void desligar(){
        if(liga == true){
            System.out.println("Ligação encerrada com sucesso");
            liga = false;
        }else{
            System.out.println("você não está em uma ligação");
        
        }
    }
}
