/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista4Ex2;

import java.util.Scanner;

/**
 *
 * @author Micro
 */
public class Main {
    public static void main(String[] args) {
        Cachorro late = new Cachorro();
        Gato mia = new Gato();
        Passaro voa = new Passaro();
        
        System.out.println("Digite o nome do animal ");
        String nome = new Scanner(System.in).nextLine();
        late.setNome(nome);
        System.out.println("Digite a idade do animal ");
        int idade = new Scanner(System.in).nextInt();
        late.setIdade(idade);
        System.out.println("Digite a raça do animal ");
        String raca = new Scanner(System.in).nextLine();
        late.setRaca(raca);
        System.out.println("Digite o porte do animal ");
        String porte = new Scanner(System.in).nextLine();
        late.setPorte(porte);
        System.out.println("Digite qual serviço no animal ");
        String servico = new Scanner(System.in).nextLine();
        late.setServico(servico);
        
        late.exibirDados();
        late.emitirSom();
    }
}
