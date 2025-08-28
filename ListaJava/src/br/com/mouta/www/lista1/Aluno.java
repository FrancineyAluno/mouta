/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista1;

/**
 *
 * @author Micro
 */
public class Aluno extends Pessoa{
    private int matricula;
    private String serie;
    private String turma;
    private String turno;

    public Aluno() {
    }

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getSerie() {
        return serie;
    }
    public void setSerie(String serie) {
        this.serie = serie;
    }
    public String getTurma() {
        return turma;
    }
    public void setTurma(String turma) {
        this.turma = turma;
    }
    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }
    @Override
    public void exibirDadosPessoa(){
        System.out.println("========Dados do Aluno========");
        System.out.println("Nome do aluno\n"+getNome());
        System.out.println("Idade do aluno\n"+getIdade());
        System.out.println("CPF do aluno\n"+getCpf());
        System.out.println("Endereço do aluno\n"+getEndereco());
        System.out.println("Matricula do aluno\n"+getMatricula());
        System.out.println("Série do aluno\n"+getSerie());
        System.out.println("Turma do aluno\n"+getTurma());
        System.out.println("Turno do aluno\n"+getTurno());
        
    }
}
