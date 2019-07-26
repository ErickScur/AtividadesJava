package br.edu.ifcvideira.Lista7;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n;
		int i;
		int par=0;
		
		
		System.out.println("Digite o tamanho do vetor: ");
		n = Integer.parseInt(in.next());
		
		int v[] = new int[n];
		
		for(i=0 ; i<n;i++) {
			System.out.println("Informe o valor "+(i+1));
			v[i] = Integer.parseInt(in.next());
			
		}
		
		for(i=0 ; i<n; i++) {
			if((v[i] % 2 ==0)&&(v[i] != 0 )) {
				par += v[i];
				
			}
		
		}
		
		System.out.println("A soma é "+par);
		
		
	}
}