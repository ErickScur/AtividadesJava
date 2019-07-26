/* 8 – Faça um algoritmo para ler uma temperatura em graus Fahrenheit,
 *  calcular e escrever o valor correspondente em graus Celsius ( C=(F-32)/1.8).

*/
package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double F;
		double C;
		
		System.out.println("Digite o valor em Fahrenheit: ");
		F = Double.parseDouble(in.nextLine());
		
		C = (F-32)/1.8;
		
		System.out.println("O valor em Celsius é: "+C);
	
		
		
	}
}
