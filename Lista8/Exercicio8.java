package br.edu.ifcvideira.Lista8;

import java.util.Random;

public class Exercicio8 {
	public static void main(String[] args) {
		Random r = new Random()
;		int m[][] = new int [7][7];
		int i;
		int j;
		int soma=0;
		
		for(i=0;i<7;i++) {
			for(j=0;j<7;j++) {
				m[i][j] = r.nextInt(10);
				if((i * j)==3) {
					soma += m[i][j];
				}
			}
		}
		
		for(i=0; i<7; i++) {
			for(j=0; j<7; j++) {
				System.out.print(m[i][j]+"    ");
			}
			System.out.println();
		}
		System.out.println("A soma dos valores dos elementos da matriz cujo o produto de seus\r\n" + 
				"índices seja múltiplo de 3 é: "+soma);
	}
}
