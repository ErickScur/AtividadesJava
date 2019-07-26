package br.edu.ifcvideira.Lista4;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double e = 0;
		double n;
		double cont = 1;
		
		System.out.println("Digite o valor N");
		n = Double.parseDouble(in.nextLine());
		
		while (cont <= n) {
		    e += 1/cont;
		    cont++;
		}
		
		System.out.println("O total é " + (e + 1));
		
		
	
	}
}