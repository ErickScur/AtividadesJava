/*6 - Faça um Programa que leia dois vetores com 10 elementos cada. Gere um
terceiro vetor de 20 elementos, cujos valores deverão ser compostos pelos
elementos intercalados dos dois outros vetores.
*/
package br.edu.ifcvideira.Lista7;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int v1[] = new int[10];
		int v2[] = new int[10];
		int v3[] = new int[20];
		int i=0;
		int j=0;
		
		for(i=0; i<10; i++) {
			System.out.println("Informe o valor para a posição "+(i+1)+" do vetor 1");
			v1[i] = Integer.parseInt(in.nextLine());
		}
		for(i=0; i<10; i++) {
			System.out.println("Informe o valor para a posição "+(i+1)+" do vetor 2");
			v2[i] = Integer.parseInt(in.nextLine());
		}
		for(i=0; i<10; i++) {
			v3[j] = v1[i];
			j++;
			v3[j] = v2[i];
		}
		System.out.println("Dados do vetor 3: ");
		for(j=0; j<20; j++) {
			System.out.println(v3[j]);
			
		}
	}
}
