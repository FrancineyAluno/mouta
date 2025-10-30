/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.MediaArray;

import java.util.Scanner;

/**
 *
 * @author Micro
 */
public class MediaAlunos {
    float[] notas = new float[3];
    float media;

    public float[] getNotas() {
        return notas;
    }

    public void setNotas(float[] notas) {
        this.notas = notas;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }
    
    
    
    public void Media(){
        System.out.println("Digite as notas do aluno");
        for(int i=0;i<notas.length;i++){
            notas[i] = new Scanner(System.in).nextFloat();
            setNotas(notas);
            
            media +=notas[i];
            System.out.println(media);
        }
        
        System.out.println("A media do aluno é "+getMedia()/3);
    }
}
