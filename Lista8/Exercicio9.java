package br.edu.ifcvideira.Lista8;

import java.util.Random;

public class Exercicio9 {
	public static void main(String[] args) {
		Random r = new Random();
		int m[][] = new int[5][6];
		int i;
		int j;
		int somaPar=0;
		int contPar=0;
		double media=0;
		
		for(i=0;i<5;i++) {
			for(j=0;j<6;j++) {
				m[i][j] = r.nextInt(10);
				if((m[i][j] % 2 == 0)&&(m[i][j]!=0)) {
					somaPar += m[i][j];
					contPar++;
				}
			}
		}
		for(i=0; i<5; i++) {
			for(j=0; j<6; j++) {
				System.out.print(m[i][j]+"    ");
			}
			System.out.println();
		}
		media = somaPar/contPar;
		System.out.println("A média dos numeros pares é: "+media);
	}
}
