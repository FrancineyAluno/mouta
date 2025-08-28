/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista6Ex1;

/**
 *
 * @author Micro
 */
public class Participante {
     private static int totalCriados = 0; 

    private String nome;
    private int idade;
    private String tipoIngresso;

    public Participante(String nome, int idade, String tipoIngresso) {
        this.nome = nome;
        this.idade = idade;
        this.tipoIngresso = tipoIngresso;
        totalCriados++; 
    }

    public static int getTotalCriados() {
        return totalCriados;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nIdade: " + idade + "\nIngresso: " + tipoIngresso;
    }
}
