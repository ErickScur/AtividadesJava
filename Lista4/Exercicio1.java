//1 � Fazer um programa que imprima os n�meros m�ltiplos de 10 at� 1000:
package br.edu.ifcvideira.Lista4;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		
		int a = 0;
		
		while(a <= 1000) {
			a++;
			if(a % 10 == 0) {
				System.out.println(+a);
			}
		}
		
	}
}
