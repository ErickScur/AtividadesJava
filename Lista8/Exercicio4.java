package br.edu.ifcvideira.Lista8;

import java.util.Random;

public class Exercicio4 {
	public static void main(String[] args) {
		Random r = new Random();
		int m1[][] = new int [5][5];
		int m2[][] = new int [5][5];
		int i;
		int j;
		
		for(i=0;i<5;i++) {
			for(j=0;j<5;j++) {
				m1[i][j] = r.nextInt(10);
				m2[i][j] = (int) Math.pow(m1[i][j], 3);
			}
		}
		System.out.println("Matriz 1: ");
		for(i=0; i<5; i++) {
			for(j=0; j<5; j++) {
				System.out.print(m1[i][j]+"    ");
			}
			System.out.println();
		}
		
		System.out.println("Matriz 2: ");
		for(i=0; i<5; i++) {
			for(j=0; j<5; j++) {
				System.out.print(m2[i][j]+"    ");
			}
			System.out.println();
		}
	}
}
