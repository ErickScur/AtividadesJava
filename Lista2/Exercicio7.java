//7 - Ler 3 valores e escrever a soma dos 2 maiores (Considerando valores distintos).
package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double n1;
		double n2;
		double n3;
		double resultado;
		
		System.out.println("Digite o primeiro valor");
		n1 = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite o segundo valor");
		n2 = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite o terceiro valor");
		n3 = Double.parseDouble(in.nextLine());
		
		if ((n1 > n3) && (n2 >n3)) {
			resultado = n1 + n2;
			System.out.println(+resultado);
		}else if ((n2 > n1) && (n3 >n1)) {
			resultado = n2 + n3;
			System.out.println(+resultado);
		}else if((n1 > n2)&&(n3 > n2)){
			resultado = n1 + n3;
			System.out.println(+resultado);
		}
	}
}
