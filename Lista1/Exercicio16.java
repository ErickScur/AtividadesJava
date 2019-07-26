/*Calcula a pressão
 */
package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

public class Exercicio16 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double A;
		double massa;
		
		System.out.println("Digite a massa do objeto: ");
		massa = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite a area de contato: ");
		A = Double.parseDouble(in.nextLine());
		
		double F = massa * 10;
		double P = F/A;
		
		System.out.println("A pressão exercida é de: "+P+ " N/m²");
	}
}
