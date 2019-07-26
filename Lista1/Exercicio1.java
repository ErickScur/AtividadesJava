//1 – Faça um algoritmo para calcular a área superficial de um cilindro (2*pi*r*h)
package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double raio;
		double altura;
		double area;
		
		System.out.println("Digite o raio do cilindro:");
		raio = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite a altura do cilindro:");
		altura = Double.parseDouble(in.nextLine());
		
		area = 2 * Math.PI * altura * raio;
		System.out.println("A area do cilindro é "+area);
		
		
	}
}
