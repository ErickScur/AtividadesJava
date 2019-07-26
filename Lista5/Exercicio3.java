package br.edu.ifcvideira.Lista5;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int cont=0;
		
	
		int a;
		int par=0;
		int pos=0;
		
		do {
			System.out.println("Digite o numero:"+(cont+1));
			a= Integer.parseInt(in.nextLine());
			
			if(a%2==0) {
				par++;
			}
			
			if(a >= 0) {
				pos++;
			}
			cont++;
		}while(cont<5);{
			System.out.println("Foram digitados "+(par)+" números pares");
			System.out.println("Foram digitados "+(5-par)+" números impares");
			System.out.println("Foram digitados "+(pos)+" números positivos");
			System.out.println("Foram digitados "+(5-pos)+" números negativos");

			
		}
	}
}
