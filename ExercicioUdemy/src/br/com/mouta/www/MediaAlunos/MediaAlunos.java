/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.MediaAlunos;

/**
 *
 * @author Micro
 */
public class MediaAlunos {
    String nome;
    float nota1,nota2,mediaAluno,mediaSala;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getMediaAluno() {
        return mediaAluno;
    }

    public void setMediaAluno(float mediaAluno) {
        this.mediaAluno = mediaAluno;
    }

    public float getMediaSala() {
        return mediaSala;
    }

    public void setMediaSala(float mediaSala) {
        this.mediaSala = mediaSala;
    }
    public void MediaAlunos(){
        
        if(mediaAluno >= 6){
            System.out.println("O Aluno "+getNome()+" está aprovado com a nota "+getMediaAluno());
        }else{
            System.out.println("O Aluno "+getNome()+" está reprovado com a nota "+getMediaAluno());   
        }
    }
}
