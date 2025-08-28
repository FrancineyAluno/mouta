/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista6Ex6;

/**
 *
 * @author Micro
 */
public abstract class Animal {
     private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public abstract void fazerSom();
}
