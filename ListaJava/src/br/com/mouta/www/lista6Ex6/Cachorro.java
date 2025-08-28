/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista6Ex6;

/**
 *
 * @author Micro
 */
public class Cachorro extends Animal{
     public Cachorro(String nome){
        super(nome);
    }
    
    @Override
    public void fazerSom() {
        System.out.println("Cachorro: Au Au!");
    }
}
