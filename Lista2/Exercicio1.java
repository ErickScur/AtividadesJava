package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double valor;
		System.out.println("Digite um valor: ");
		valor = Double.parseDouble(in.nextLine());
		
		if (valor > 0) {
			System.out.println("O valor � positivo");
		}else if (valor < 0) {
			System.out.println("O valor � negativo");
		}else{
			System.out.println("O valor � igual a zero");
		}
		
	}
}
