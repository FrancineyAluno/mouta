/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista4Ex4;

import java.util.Scanner;

/**
 *
 * @author Micro
 */
public class Main {
    public static void main(String[] args) {
        PacienteComum comum = new PacienteComum();
        PacienteConvenio convenio = new PacienteConvenio();
        PacienteVip vip = new PacienteVip();
        
        System.out.println("Nome do pacirnte");
        String nome = new Scanner(System.in).nextLine();
        vip.setNome(nome);
        System.out.println("Cpf do pacirnte");
        String cpf = new Scanner(System.in).nextLine();
        vip.setCpf(cpf);
        System.out.println("Idade do pacirnte");
        int idade = new Scanner(System.in).nextInt();
        vip.setIdade(idade);
        System.out.println("Valor da consulta");
        float valor = new Scanner(System.in).nextFloat();
        vip.setValor(valor);
        
        vip.dadosPaciente();
        vip.desconto();
    }
}
