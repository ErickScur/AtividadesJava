//7 – Faça um algoritmo para calcular o volume de um cone (pi*r^2*h) / 3)
package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double raio;
		double altura;
		double volume;
		
		System.out.println("Digite o raio do cone: ");
		raio = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite a altura do cone: ");
		altura = Double.parseDouble(in.nextLine());
		
		volume = (Math.PI * Math.pow(raio, 2)* altura) /3;
		
		System.out.println("O volume do cone é: "+volume);
		
		
	}
}
