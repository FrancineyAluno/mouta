/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista1;

import java.util.Scanner;

/**
 *
 * @author Micro
 */
public class Main {
    public static void main(String[] args) {
        
        Aluno aluno = new Aluno();
        Professor professor = new Professor();
        
        /*
        System.out.println("Qual o nome do aluno");
        String nome = new Scanner(System.in).nextLine();
        aluno.setNome(nome);
        System.out.println("Qual a idade do aluno");
        int idade = new Scanner(System.in).nextInt();
        aluno.setIdade(idade);
        System.out.println("Qual o CPF do aluno");
        String cpf = new Scanner(System.in).nextLine();
        aluno.setCpf(cpf);
        System.out.println("Qual o endereço do aluno");
        String endereco = new Scanner(System.in).nextLine();
        aluno.setEndereco(endereco);
        System.out.println("Qual a matricula do aluno");
        int matricula = new Scanner(System.in).nextInt();
        aluno.setMatricula(matricula);
        System.out.println("Qual a série do aluno");
        String serie = new Scanner(System.in).nextLine();
        aluno.setSerie(serie);
        System.out.println("Qual a turma do aluno");
        String turma = new Scanner(System.in).nextLine();
        aluno.setTurma(turma);
        System.out.println("Qual o turno do aluno");
        String turno = new Scanner(System.in).nextLine();
        aluno.setTurno(turno);
        
        aluno.exibirDadosPessoa();
        */
        System.out.println("Qual o nome do Professor");
        String nome = new Scanner(System.in).nextLine();
        professor.setNome(nome);
        
        professor.exibirDadosPessoa();
    }
}
