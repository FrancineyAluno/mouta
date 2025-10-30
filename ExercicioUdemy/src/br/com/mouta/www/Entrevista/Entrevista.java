/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.Entrevista;

import java.util.Scanner;

/**
 *
 * @author Micro
 */
public class Entrevista {
    private int numPesq;
    private int[] quantFilhos = new int[10];
    String[][] nomeFilhos = new String[10][10];
    String[] nomeResp = new String[10];
    private int i,j;

    public int getNumPesq() {
        return numPesq;
    }

    public void setNumPesq(int numPesq) {
        this.numPesq = numPesq;
    }

    public int[] getQuantFilhos() {
        return quantFilhos;
    }

    public void setQuantFilhos(int[] quantFilhos) {
        this.quantFilhos = quantFilhos;
    }
    

    public String[][] getNomeFilhos() {
        return nomeFilhos;
    }

    public void setNomeFilhos(String[][] nomeFilhos) {
        this.nomeFilhos = nomeFilhos;
    }

    public String[] getNomeResp() {
        return nomeResp;
    }

    public void setNomeResp(String[] nomeResp) {
        this.nomeResp = nomeResp;
    }
    public void pesquisados(){
        System.out.println("Quantos foram entrevistados ");
        numPesq = new Scanner(System.in).nextInt();
        setNumPesq(numPesq);
        
        for(i=0;i<numPesq;i++){
            System.out.println("Qual o nome do entrevistado "+(i+1));
            nomeResp[i] = new Scanner(System.in).nextLine();
            setNomeResp(nomeResp);
            
            System.out.println("Quantos filhos o "+nomeResp[i]+" tem");
            quantFilhos[i] = new Scanner(System.in).nextInt();
            setQuantFilhos(quantFilhos);
            
            for(j=0;j<quantFilhos[i];j++){
                System.out.println("Nome do "+(j+1)+" filho do "+nomeResp[i]);
                nomeFilhos[i][j] = new Scanner(System.in).nextLine();
                setNomeFilhos(nomeFilhos);
            }
        }
        for(i=0;i<numPesq;i++){
            if(quantFilhos[i]==1){
                System.out.println(nomeResp[i]+" tem "+quantFilhos[i]+" filho e o nome é");
            }
            if(quantFilhos[i] > 1){
                System.out.println(nomeResp[i]+" tem "+quantFilhos[i]+" filhos e os nomes são");
            }
            for(j=0;j<quantFilhos[i];j++){
                System.out.println(nomeFilhos[i][j]);
            }
        }
    }
}
