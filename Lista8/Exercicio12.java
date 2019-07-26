package br.edu.ifcvideira.Lista8;

import java.util.Random;
import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Random r = new Random();
		
		double notas[][] = new double[15][4];
		String nomes[] = new String[15];
		int i;
		int j;
		double mediaAluno=0;
		double mediaGeral=0;
		
		//recebimento dos valores
		for (i=0; i<5; i++) {//controle de linhas
			System.out.println("Qual é o nome do aluno "+(i+1));
			nomes[i] = String.valueOf(in.nextLine());
			for (j=0; j<4; j++) {//controle das colunas
				notas[i][j] = r.nextInt(6)+5;
			}
		}
		
		//calcular e imprimir as médias
		for (i=0; i<5; i++) {
			System.out.print(nomes[i]+"   ");
			for (j=0; j<4; j++) {
				System.out.print(notas[i][j]+"   ");
				mediaAluno += notas[i][j];
			}
			mediaAluno /= j;
			
			System.out.println(mediaAluno+"   ");
			if (mediaAluno < 7) {
				System.out.println("Reprovado");
			}
			else {
				System.out.println("Aprovado");
			}
			
			mediaGeral += mediaAluno;
			mediaAluno = 0;
		}
		System.out.println("A média geral da turma é: "+(mediaGeral/i));
		in.close();
	}
}