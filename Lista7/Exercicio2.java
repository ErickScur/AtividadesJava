package br.edu.ifcvideira.Lista7;

import java.util.*;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int v[] = new int[20];

		int i=0;
		boolean flag = false;
		//recebendo valores
		for(i=0; i<20; i++) {
			System.out.println("Digite o valor "+(i+1));
			v[i] = Integer.parseInt(in.next());
		}
		//verificando se é igual a 10
		for(i=0;i<20;i++) {
			if(v[i]==10) {
				System.out.println(" Foi encontrado um valor igual a 10 na posição:  "+(i+1));
				flag = true;
				
			}
			
		}
		//caso nao foi encontrado nenhum valor igual a 10
		if (flag == false) {
			System.out.println("Não foram encontrados valores iguais a 10.");
		}
		
		
		
		
	}

}