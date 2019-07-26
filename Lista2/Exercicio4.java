// Ler dois valores e escrever o maior deles.
package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double n1;
		double n2;
		
		System.out.println("Digite o primeiro valor");
		n1 = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite o segundo valor");
		n2 = Double.parseDouble(in.nextLine());
		
		if (n1 > n2) {
			System.out.println(+n1+ " É o maior");
		}else {
			System.out.println(+n2+ " É o maior");
		}
	}
}
