/*9 - Fa�a um algoritmo que leia um n� inteiro e mostre uma mensagem indicando
se este n�mero � par ou �mpar. Ex: se (x%2=0) �x � par�, se (x%2=1) �x � impar�.
 */
package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n1;
		
		System.out.println("Digite um numero inteiro: ");
		n1 = Integer.parseInt(in.nextLine());
		
		if (n1 % 2 == 0) {
			System.out.println("O numero � par");
		}else {
			System.out.println("O numero � impar");
		}
	}
}
