/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.TelaLogin;

import java.util.Scanner;

/**
 *
 * @author Micro
 */
public class Main {
    public static void main(String[] args) {
        telaLogin login = new telaLogin();
        
        System.out.println("Login");
        String nome = new Scanner(System.in).nextLine();
        login.setNome(nome);
        
        System.out.println("Senha");
        int senha = new Scanner(System.in).nextInt();
        login.setSenha(senha);
        
        login.Login();
    }
}
