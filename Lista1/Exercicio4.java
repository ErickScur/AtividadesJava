//4 – Faça um algoritmo para calcular a área de um cone(pi*r*h)
package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double raio;
		double altura;
		double area;
		
		System.out.println("Digite o raio do cone: ");
		raio = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite a altura do cone: ");
		altura = Double.parseDouble(in.nextLine());
		
		area = Math.PI * raio * altura;
		
		System.out.println("A area do cone é: "+area);
		
 	}
}
