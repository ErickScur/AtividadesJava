package br.edu.ifcvideira.Lista7;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		double p[] = new double[10];
		String cod[] = new String[10];
		int i;
		int j;
		double aux=0;
		String auxCod;
		
		for (i=0;i<10;i++) {
			System.out.println("Digite o preço do item "+(i+1));
			p[i]= Double.parseDouble(in.nextLine());
			
			System.out.println("Digite o codigo do item "+(i+1));
			cod[i]= String.valueOf(in.nextLine());
		}
		//algoritimo de ordenação boubble sort
		for(j=0; j<10; j++) {
			for (i=0; i<9; i++) {
				if (p[i] > p[i+1]) {
					aux = p[i];
					auxCod = cod[i];
					p[i] = p[i+1];
					cod[i] = cod[i+1];
					p[i+1] = aux;
					cod[i+1] = auxCod;
				}
			}
		}
		System.out.println("Os 3 itens mais caros são:");
		for(i=7; i<10; i++) {
			System.out.println(cod[i]+"- R$"+p[i]);
		}
	}
}
