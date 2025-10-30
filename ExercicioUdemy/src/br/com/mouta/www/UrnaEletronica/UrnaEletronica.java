/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.UrnaEletronica;
import java.util.Scanner;
/**
 *
 * @author Micro
 */
public class UrnaEletronica {
    private int voto;
    private int cand1;
    private int cand2;
    private int cand3;
    private int totalVotos;
    
    public int getVoto() {
        return voto;
    }
    public void setVoto(int voto) {
        this.voto = voto;
    }
    public int getCand1() {
        return cand1;
    }
    public void setCand1(int cand1) {
        this.cand1 = cand1;
    }
    public int getCand2() {
        return cand2;
    }
    public void setCand2(int cand2) {
        this.cand2 = cand2;
    }
    public int getCand3() {
        return cand3;
    }
    public void setCand3(int cand3) {
        this.cand3 = cand3;
    }
    public void exibirVotos(){
        int op;
        do{
            System.out.println("Qual o seu voto\n1 - para Franciney\n2 - para Rubens\n3 - para Antonia");
            int votar = new Scanner(System.in).nextInt();
            setVoto(votar);
            switch(voto){
                case 1:
                    cand1++;
                break;
                case 2:
                    cand2++;
                break;
                case 3:
                    cand3++;
                break;
                default:
                    System.out.println("Candidato não registrado");
            }
            op = voto;
        }while(op!=0);
        System.out.println("Os votos do candidato Franciney foram "+getCand1());
        System.out.println("Os votos do candidato Rubens foram "+getCand2());
        System.out.println("Os votos do candidato Antonia foram "+getCand3());
        
        if(cand1 > cand2 && cand1 > cand3){
            System.out.println("Franciney venceu com "+getCand1()+" votos");
        }else if(cand2 > cand1 && cand2 > cand3){
            System.out.println("Rubens venceu com "+getCand2()+" votos");
        }else if(cand3 > cand1 && cand3 > cand2){
            System.out.println("Antonia Ganhou com "+getCand3()+" votos");
        }else{
            System.out.println("Há candidatos empatados");
        }
        
        totalVotos = cand1+cand2+cand3;
        System.out.println("O total de votos foram "+totalVotos);
    }
}