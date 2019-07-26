package br.edu.ifcvideira.Lista8;

import java.util.Random;

public class Exercicio5 {
	public static void main(String[] args) {
		Random r = new Random();
		int m[][] = new int [3][4];
		int i;
		int j;
		for(i=0;i<3;i++) {
			for(j=0;j<4;j++) {
				m[i][j] = r.nextInt(10);
			}
		}
		for(i=0; i<3; i++) {
			for(j=0; j<4; j++) {
				System.out.print(m[i][j]+"    ");
			}
			System.out.println();
		}
		
		System.out.println("Canto superior esquerdo: "+m[0][0]);
		System.out.println("Canto inferior esquerdo: "+m[2][0]);

	}
}
