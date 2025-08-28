/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista6Ex6;

import java.util.ArrayList;

/**
 *
 * @author Micro
 */
public class Main {
     public static void main(String[] args) {
         ArrayList<Animal> animais = new ArrayList<>();

        animais.add(new Cachorro("Spaker"));
        animais.add(new Gato("Mel"));
        animais.add(new Vaca("Batina"));

        System.out.println("\n\n=== Sons dos Animais ===");
        for (Animal animal : animais) {
            System.out.print(animal.getNome() + " faz: ");
            animal.fazerSom();
        }
    }
}
