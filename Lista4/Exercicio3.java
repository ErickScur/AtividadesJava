package br.edu.ifcvideira.Lista4;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int numero;
		int negativo = 0;
		
		while (2>1){
			System.out.println("Digite um numero: (0 para finalizar)");
			numero = Integer.parseInt(in.nextLine());
			
			if(numero == 0) {
				break;
			}
			if(numero < 0 ) {
				negativo++;
			}
		}
		System.out.println("A quantidade de numeros negativos é: "+negativo);
	}
}
