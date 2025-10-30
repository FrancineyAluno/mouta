/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.MediaMatriz;

import java.util.Scanner;

/**
 *
 * @author Micro
 */
public class MediaMatriz {
    private String[] aluno = new String[3];
    private float[][] nota = new float[3][3];
    private float media,media1;
    private int i,j;

    public String[] getAluno() {
        return aluno;
    }

    public void setAluno(String[] aluno) {
        this.aluno = aluno;
    }

    public float[][] getNota() {
        return nota;
    }

    public void setNota(float[][] nota) {
        this.nota = nota;
    }
    public void mediaAluno(){
        for(i=0;i<3;i++){
            System.out.println("Digite o nome do aluno(a) ");
            aluno[i] = new Scanner(System.in).nextLine();
            setAluno(aluno);
            for(j=0;j<3;j++){
                System.out.println("Digite a "+(j+1)+" nota do aluno "+getAluno()[i]);
                nota[i][j] = new Scanner(System.in).nextFloat();
                setNota(nota);
            }
        }
        for(i=0;i<3;i++){
            System.out.println("O aluno "+aluno[i]);
            for(j=0;j<3;j++){
                System.out.println(" tem a nota "+ (j+1)+" " + nota[i][j]);
            }
        }
        for(i=0;i<3;i++){
            System.out.print("O aluno "+aluno[i]);
            for(j=0;j<3;j++){
                media = media + nota[i][j];
                media1 = media/3;
            }
            System.out.println(" tem a média de "+ media1);
            if(media1<=10 && media1>=6){
                System.out.println("O aluno "+aluno[i]+" está aprovado");
            }else if(media1<6 && media1>=2){
                System.out.println("O aluno "+aluno[i]+" está de recuperação");
            }else if(media1 < 2 && media1 >=0){
                System.out.println("O aluno "+aluno[i]+" está reprovado");
            }
        media= 0;
        media1 = 0;
        }
    }
}
