//5 – Faça um algoritmo para calcular o volume de um cilindro(pi*r^2*h)
package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double raio;
		double altura;
		double volume;
		
		System.out.println("Digite o raio do cilindro: ");
		raio = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite a altura do cilindro: ");
		altura = Double.parseDouble(in.nextLine());
		
		volume = Math.PI * Math.pow(raio,2) * altura;
		System.out.println("O volume do cilindro é: "+volume);
		
	}
}
