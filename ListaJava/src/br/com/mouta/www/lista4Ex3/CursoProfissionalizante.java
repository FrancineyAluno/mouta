/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista4Ex3;

/**
 *
 * @author Micro
 */
public class CursoProfissionalizante extends Curso{
    
    public CursoProfissionalizante(String nome, int duracao, float valorMensalidade) {
        super(nome, duracao, valorMensalidade);
    }

    @Override
    public float calcularDesconto() {
        return (float) (getValorMensalidade() * 0.15);
    }

    public void beneficioExtra() {
        System.out.println("Benefício: Material didático gratuito incluído.");
    
    }
}