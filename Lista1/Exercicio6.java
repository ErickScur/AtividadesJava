//6 – Faça um algoritmo para calcular o volume de uma esfera(4/3*pi*r^3)
package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double raio;
		double volume;
		
		System.out.println("Digite o raio da esfera: ");
		raio = Double.parseDouble(in.nextLine());
		
		volume = 4 /3 * Math.PI * Math.pow(raio, 3);
		
		System.out.println("O volume da esfera é: "+volume);
	}
}
