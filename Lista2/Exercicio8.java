//8 - Ler 3 valores e escrevê-los em ordem crescente (Considerando valores distintos)
package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double n1;
		double n2;
		double n3;
		double resultado;
		
		System.out.println("Digite o primeiro valor");
		n1 = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite o segundo valor");
		n2 = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite o terceiro valor");
		n3 = Double.parseDouble(in.nextLine());
	}
}
