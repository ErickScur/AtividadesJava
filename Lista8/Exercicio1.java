package br.edu.ifcvideira.Lista8;

import java.util.Random;
import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		
		int matriz[][] = new int [5][5];
		int i;
		int j;
		int somaPares = 0;
		int contPares = 0;
		
		for(i=0; i<5; i++) {
			for(j=0; j<5; j++) {
				//System.out.println("Digite um valor para o indice("+i+","+j+")|");
				//matriz[i][j] = Integer.parseInt(in.nextLine());
				
				matriz[i][j] = r.nextInt(10);
				if(matriz[i][j] % 2 == 0) {
						somaPares += matriz[i][j];
						contPares++;
				}
			}
		}
		for(i=0; i<5; i++) {
			for(j=0; j<5; j++) {
				System.out.print(matriz[i][j]+"    ");
				
			}
			System.out.println();
		}
		System.out.println("A media entre os pares é "+((double)somaPares/contPares));
		in.close();
	}
}