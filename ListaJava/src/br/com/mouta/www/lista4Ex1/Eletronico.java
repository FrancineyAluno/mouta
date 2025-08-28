/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista4Ex1;

/**
 *
 * @author Micro
 */
public abstract class Eletronico {
    private String tipoEletronico;
    private String marca;
    private String modelo;
    private int ano;

    public String getTipoEletronico() {
        return tipoEletronico;
    }

    public void setTipoEletronico(String tipoEletronico) {
        this.tipoEletronico = tipoEletronico;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public abstract void exibirDados();
    
    
}
