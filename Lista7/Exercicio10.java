//Faça um algoritmo que solicita 10 números inteiros. Em seguida, exiba a
//posição no vetor em que se encontra o primeiro número negativo. Caso não tenha
//nenhum número negativo, exiba a mensagem “Não tem números negativos!”.

package br.edu.ifcvideira.Lista7;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int x[] = new int[10];
		boolean flag = false;
		
		for(int i=0; i<10;i++) {
			System.out.println("Digite o valor "+(i+1));
			x[i] = Integer.parseInt(in.next());
		
		}
		
		for(int i = 0; i<10;i++) {
			if(x[i]<0) {
				System.out.println("O primeiro valor negativo se encontra na posição: "+(i+1));
				flag = true;
				break;
			}
		
		}
		
		if(flag==false) {
			System.out.println("Não tem numeros negativos!");
		}
		
				
		
		
	}
}
