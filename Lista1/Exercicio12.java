//12 - Fa�a um algoritmo que calcule a m�dia de quatro n�meros inteiros.
//Os n�meros devem ser dados pelo usu�rio
package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double n1;
		double n2;
		double n3;
		double n4;
		double media;
		
		System.out.println("Digite o numero 1");
		n1 = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite o numero 2");
		n2 = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite o numero 3");
		n3 = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite o numero 4");
		n4 = Double.parseDouble(in.nextLine());
		
		media = (n1 + n2 + n3 + n4) /4;
		
		System.out.println("A m�dia �: "+media);
	}
}
