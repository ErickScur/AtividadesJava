//Fa�a um algoritmo que solicita 10 n�meros inteiros. Em seguida, exiba a
//posi��o no vetor em que se encontra o primeiro n�mero negativo. Caso n�o tenha
//nenhum n�mero negativo, exiba a mensagem �N�o tem n�meros negativos!�.

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
				System.out.println("O primeiro valor negativo se encontra na posi��o: "+(i+1));
				flag = true;
				break;
			}
		
		}
		
		if(flag==false) {
			System.out.println("N�o tem numeros negativos!");
		}
		
				
		
		
	}
}
