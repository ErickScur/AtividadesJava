package br.edu.ifcvideira.Lista8;

import java.util.Random;

public class Exercicio10 {
	public static void main(String[] args) {
		Random r = new Random();
		int m[][] = new int[6][3];
		int i;
		int j;
		int posicaoMaior[] = new int[2];
		int posicaoMenor[] = new int[2];
		int menor=0;
		int maior=0;
		
		for(i=0;i<6;i++) {
			for(j=0;j<3;j++) {
				m[i][j] = r.nextInt(10);
				if(m[i][j]>maior) {
					maior = m[i][j];
					posicaoMaior[0]=i;
					posicaoMaior[1]=j;
				}
				if(m[i][j]<menor) {
					maior = m[i][j];
					posicaoMenor[0]=i;
					posicaoMenor[1]=j;
				}
			}
		}
		for(i=0; i<6; i++) {
			for(j=0; j<3; j++) {
				System.out.print(m[i][j]+"    ");
			}
			System.out.println();
		}
		System.out.println("O maior numero é: "+maior+" Sua posição é: "+posicaoMaior[0]+","+posicaoMaior[1]);
		System.out.println("O menor numero é: "+menor+" Sua posição é: "+posicaoMenor[0]+","+posicaoMenor[1]);
	}
}
