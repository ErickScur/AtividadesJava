/*1 � Escreva um algoritmo que leia um vetor de 10 posi��es e imprima os
elementos que s�o maiores que 20, caso n�o houver nenhum elemento mostrar
uma mensagem de aviso ao usu�rio.
*/ 
package br.edu.ifcvideira.Lista7;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int vetor[] = new int[10];
		int i;
		int flag=0;
		
		
		for(i=0;i<10;i++) {
			System.out.println("Digite um valor para a posi��o "+(i+1));
			vetor[i] = Integer.parseInt(in.nextLine());
		}
		
		for (i=0;i<10;i++) {
			if(vetor[i] >20) {
				if(flag==0) {
					System.out.println("Valores maiores que 20: ");
				}
				System.out.println(vetor[i]);
				flag=1;
			}
		}
		if(flag==0) {
			System.out.println("Nenhum numero � maior que 20");
		}
	}
}
