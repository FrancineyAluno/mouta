/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista4Ex3;

/**
 *
 * @author Micro
 */
public class Main {
    public static void main(String[] args) {
        CursoRegular cursoRegular = new CursoRegular("Matemática", 15, 300);
        CursoTecnico cursoTecnico = new CursoTecnico("Técnico em Informática", 18, 700);
        CursoProfissionalizante cursoProf = new CursoProfissionalizante("Cabeleireiro Profissional", 6, 400);

        System.out.println("--- Curso Regular ---");
        cursoRegular.exibirInfo();

        System.out.println("\n--- Curso Técnico ---");
        cursoTecnico.exibirInfo();

        System.out.println("\n--- Curso Profissionalizante ---");
        cursoProf.exibirInfo();
        cursoProf.beneficioExtra();
    }
}   

