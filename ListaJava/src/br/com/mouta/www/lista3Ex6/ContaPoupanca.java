/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mouta.www.lista3Ex6;

/**
 *
 * @author Micro
 */
public class ContaPoupanca extends ContaBanco{
    private float deposito;
    private float jurosDeposito;
    private float saldo;
    private float saque;
    private float jurosSaque;
    private float novoDeposito;
    private float novoSaque;

    public float getDeposito() {
        return deposito;
    }

    public void setDeposito(float deposito) {
        this.deposito = deposito;
    }

    public float getJurosDeposito() {
        return jurosDeposito;
    }

    public void setJurosDeposito(float jurosDeposito) {
        this.jurosDeposito = jurosDeposito;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getSaque() {
        return saque;
    }

    public void setSaque(float saque) {
        this.saque = saque;
    }

    public float getJurosSaque() {
        return jurosSaque;
    }

    public void setJurosSaque(float jurosSaque) {
        this.jurosSaque = jurosSaque;
    }
    @Override
    public void verConta(){
        jurosDeposito = deposito*5/100;
        novoDeposito = deposito + jurosDeposito;
        jurosSaque = saque*3/100;
        novoSaque = deposito - jurosSaque - saque + jurosDeposito;
        System.out.println("Banco "+getBanco());
        System.out.println("Agengia "+getNumAgencia());
        System.out.println("Nome do cliente "+getNomeCliente());
        System.out.println("Numero da conta "+getNumConta());
        System.out.println("Depositado "+getDeposito());
        System.out.println("Saldo com juros "+novoDeposito);
        System.out.println("Foi sacado "+getSaque());
        System.out.println("Saldo depois do saque "+novoSaque);
    }
}
