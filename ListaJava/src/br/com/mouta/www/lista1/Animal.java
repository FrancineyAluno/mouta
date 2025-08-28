/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista1;

/**
 *
 * @author Micro
 */
public abstract class Animal {
    private String especie;
    private String raca;
    private int dtNasc;

    public Animal() {
    }

    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public int getDtNasc() {
        return dtNasc;
    }
    public void setDtNasc(int dtNasc) {
        this.dtNasc = dtNasc;
    }
     public abstract void exibirDadosAnimal();
}
