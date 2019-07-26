//Elabore um algoritmo que permita ler 3 notas de alunos de uma turma e os
//respectivos nomes, identifique qual a nota máxima e a mínima e mostre quais os
//respectivos nomes dos alunos que as obtiveram.


package br.edu.ifcvideira.Lista7;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double notas[] = new double[3];
		
		int i;
		int n;
		int c;
		int j;
		double aux;
		
		System.out.println("Quantos Alunos Terão?");
		n = Integer.parseInt(in.next());
		
		String nomes[] = new String[n];
		
		for (i=0; i<n;i++) {
			System.out.println("Digite o nome do Aluno "+(i+1));
			nomes[i] = String.valueOf(in.next());
			
			for(c=0; c<3; c++) {
				System.out.println("Qual a nota "+(c+1)+" do aluno "+(i+1)+"?");
				notas[c] = Double.parseDouble(in.next());
			}
			
			for( j = 0; j<3;j++) {
				for(c=0; c<2; c++) {
					if(notas[c]>notas[c+1]) {
						aux = notas[c];
						notas[c] = notas[c+1];
						notas[c+1] = aux;
					}
				}
		}
				System.out.println("Aluno: "+nomes[i]+"\n"
						+ " Maior nota: "+notas[2]+"\n"
						+ " Menor nota: "+notas[0]);
		}	
	}
}
