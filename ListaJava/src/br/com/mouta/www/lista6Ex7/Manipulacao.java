/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista6Ex7;

/**
 *
 * @author Micro
 */
public class Manipulacao {
    private String texto;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    public void exibirResultado(){
        System.out.println("A ordem inversa do texto é "+ new StringBuilder(getTexto()).reverse().toString());
        System.out.println("O tamanho do texto é "+ getTexto().length());
    }
}
