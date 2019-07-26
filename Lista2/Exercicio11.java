/*11. Faça um programa que receba um valor qualquer, ao usuário digitar 1
converta para m2, ao usuário digitar 2, converta para m3
 */
package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double valor;
		int escolha;
		double resultado;
		
		System.out.println("Digite o valor");
		valor = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite 1 para transformar em m² ou digite 2 para transformar em m³");
		escolha = Integer.parseInt(in.nextLine());
		
		if(escolha == 1) {
			resultado = valor/100;
			System.out.println(+resultado+" m²");
		}else {
			resultado = valor/1000;
			System.out.println(+resultado+" m³");
		}
	}
}
