//Faça um algoritmo que, para um vetor X de 15 elementos inteiros, transforme
//para zero todos os elementos que receberem valores negativos, em seguida,
//exiba o vetor com as alterações.

package br.edu.ifcvideira.Lista7;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int x[] = new int[15];
		
		for(int i=0; i<15; i++) {
			System.out.println("Digite o valor "+(i+1));
			x[i] = Integer.parseInt(in.next());
			
			if(x[i]<0) {
				x[i] = 0;
			}
			
		}
		
		System.out.println("Vetor corrigido: ");
		for(int j = 0; j<15; j++) {
			System.out.println(x[j]);
		}
		
		
		
		
	}
}
