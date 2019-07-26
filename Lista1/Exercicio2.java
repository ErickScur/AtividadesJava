package br.edu.ifcvideira.Lista1;

import java.util.Scanner;
public class Exercicio2 {
	public static void main(String[] args) {
		double altura;
		double lado;
		double base;
		double area;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite a altura do cubo:");
		altura = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite a base do cubo:");
		base = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite o lado do cubo:");
		lado = Double.parseDouble(in.nextLine());
		
		area =((altura*lado)+(altura*base)+(lado*base))*2;
		
		System.out.println("A área do cubo é " +area);
	}
}
