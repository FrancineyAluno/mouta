/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista4Ex4;

/**
 *
 * @author Micro
 */
public class PacienteVip extends Paciente{
    private float desconto;

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    @Override
    public void dadosPaciente() {
        System.out.println("O nome do Paciente é "+getNome());
        System.err.println("O cpf do paciente é "+getCpf());
        System.out.println("A idade do paciente é "+getIdade());
    }
    public void desconto(){
        desconto = (float) (getValor()-30);
        System.out.println("O valor da consulta ficou em "+desconto);
    }
}
