/*9 - Faça um algoritmo que leia um nº inteiro e mostre uma mensagem indicando
se este número é par ou ímpar. Ex: se (x%2=0) “x é par”, se (x%2=1) “x é impar”.
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
			System.out.println("O numero é par");
		}else {
			System.out.println("O numero é impar");
		}
	}
}
