package br.edu.ifcvideira.Lista4;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double n;
		double a1;
		double r;
		double soma = 0;
		double cont = 0;
		
		System.out.println("Digite o número de termos da progressão aritmética");
		n = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite o primeiro termo da progressão");
		a1 = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite a razão da progressão");
		r = Double.parseDouble(in.nextLine());
		
		while (cont != n) {
			soma += a1;
			System.out.println(a1);
			cont++;
			a1 += r;
		}
		System.out.println("A soma dos resultados é : " + soma);
		
		
	}
}
