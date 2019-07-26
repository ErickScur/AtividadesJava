package br.edu.ifcvideira.Lista8;

import java.util.Random;

public class Exercicio11 {
	public static void main(String[] args) {
		Random r = new Random();
		int m[][] = new int[6][4];
		int i;
		int j;
		int maior=0;
		
		
		for(i=0 ; i<6; i++) {
			for(j=0;j<4;j++) {
				m[i][j] = r.nextInt(10);
				
			}
		}
		
		
		
		
		
		
		for(i=0; i<6; i++) {
			for(j=0; j<4; j++) {
				System.out.print(m[i][j]+"    ");
				
			}
			System.out.println();
		}
	}
}
