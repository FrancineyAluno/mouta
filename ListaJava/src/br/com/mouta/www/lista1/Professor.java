/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista1;

/**
 *
 * @author Micro
 */
public class Professor extends Pessoa{
    private int matricula;
    private String displina;
     private float salario;

    public Professor() {
    }

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getDisplina() {
        return displina;
    }
    public void setDisplina(String displina) {
        this.displina = displina;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public void exibirDadosPessoa() {
        System.out.println("========Dados do professor==========");
        System.out.println("Nome do professor\n"+getNome());
        System.out.println("Idade do professor\n"+getIdade());
        System.out.println("CPF do professor\n"+getCpf());
        System.out.println("Endereço do professor\n"+getEndereco());
        System.out.println("Matricula do professor\n"+getMatricula());
        System.out.println("Disciplina do professor\n"+getDisplina());
        System.out.println("Salário do professor"+getSalario());
    }
    
}
