/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista4Ex3;

/**
 *
 * @author Micro
 */
public abstract class Curso {
    private String nomeCurso;
    private int duracao; 
    float Mensalidade;

    public Curso(String nomeCurdo, int duracao, float Mensalidade) {
        this.nomeCurso = nomeCurdo;
        this.duracao = duracao;
        this.Mensalidade = Mensalidade;
    }

    public String getNome() {
        return nomeCurso;
    }

    public int getDuracao() {
        return duracao;
    }

    public float getValorMensalidade() {
        return Mensalidade;
    }

    public void setMensalidade(float Mensalidade) {
        this.Mensalidade = Mensalidade;
    }

   
    public abstract float calcularDesconto();

    public float valorComDesconto() {
        return Mensalidade - calcularDesconto();
    }

    public void exibirInfo() {
        System.out.println("Curso: " + nomeCurso);
        System.out.println("Duração: " + duracao + " meses");
        System.out.println("Valor mensalidade: R$" + Mensalidade);
        System.out.println("Valor com desconto: R$" + valorComDesconto());
    }
}