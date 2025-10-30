package br.com.mouta.www.Caixaeletronico;

import java.util.Scanner;

public class CaixaEletronico {
    private String nome;
    private float conta;
    private float deposito;
    private float saque;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getConta() {
        return conta;
    }

    public void setConta(float conta) {
        this.conta = conta;
    }
    
    public float getDeposito() {
        return deposito;
    }

    public void setDeposito(float deposito) {
        this.deposito = deposito;
    }

    public float getSaque() {
        return saque;
    }

    public void setSaque(float saque) {
        this.saque = saque;
    }
    public void caixaEletronico(){
        System.out.println("Nome do cliente");
        nome = new Scanner(System.in).nextLine();
        setNome(nome);
        System.out.println("Valor do deposito");
        deposito = new Scanner(System.in).nextInt();
        setDeposito(deposito);
        System.out.println("Valor do saque");
        saque = new Scanner(System.in).nextInt();
        conta = deposito - saque;
        System.out.println("Nome do cliente "+getNome());
        System.out.println("Valor do deposito "+getDeposito());
        System.out.println("Valo do Saque "+getSaque());
        System.out.println("Saldo depois do saque "+getConta());
        
        
    }
}
