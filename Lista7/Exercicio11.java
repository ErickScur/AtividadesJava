package br.edu.ifcvideira.Lista7;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String nomes[] = new String[5];
		int i;
		String pesquisa;
		int flag=0;
		//recebimento dos nomes no vetor
		for(i=0; i<5; i++) {
			System.out.println("Digite um nome para a posi��o "+(i+1));
			nomes[i] = String.valueOf(in.nextLine());
		}
		//recebimento do nome a ser pesquisado
		System.out.println("Digite o nome a ser pesquisado: ");
		pesquisa= String.valueOf(in.nextLine());
		//busca pelo nome pesquisado no vetor
		for(i=0; i<5; i++) {
			if(nomes[i].equalsIgnoreCase(pesquisa)) {
				System.out.println("O nome "+nomes[i]+" foi encontrado na posi��o "+(i+1));
				flag=1;
			}
		}
		//verifica��o 
		if(flag==0) {
			System.out.println("O nome "+pesquisa+ " n�o foi encontrado");
		}
	}
}
