package br.com.mouta.www.Decrescente;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Decrescente dec = new Decrescente();
        System.out.println("Digite o primeiro valor:");
        int num1 = new Scanner(System.in).nextInt();
        dec.setNum1(num1);
        
        System.out.println("Digite o primeiro valor:");
        int num2 = new Scanner(System.in).nextInt();
        dec.setNum2(num2);
        
        dec.decescente();
	}

}
