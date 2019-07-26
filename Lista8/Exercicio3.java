package br.edu.ifcvideira.Lista8;

import java.util.Random;
import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		int m[][] = new int [5][5];
		int i;
		int j;
		int l4=0;
		int c2=0;
		int dp=0;
		int ds=0;
		int total=0;
		
		for(i=0; i<5; i++) {
			for(j=0 ; j<5 ; j++) {
				m[i][j] = r.nextInt(10);
				if (i==3) {
					l4 += m[i][j];
				}
				if(j == 1) {
					c2 += m[i][j];
				}
				if (i==j) {
					dp += m[i][j];
				}
				if((i+j)==4) {
					ds += m[i][j];
				}
				total += m[i][j];
			}
		}
		for(i=0; i<5; i++) {
			for(j=0; j<5; j++) {
				System.out.print(m[i][j]+"    ");
			}
			System.out.println();
		}
		
		System.out.println("A soma da linha 4 é: "+l4);
		System.out.println("A soma da coluna 2 é: "+c2);
		System.out.println("A soma da diagonal principal é: "+dp);
		System.out.println("A soma da diagonal secundaria é: "+ds);
		System.out.println("A soma total da matriz é: "+total);


	}
	
}
