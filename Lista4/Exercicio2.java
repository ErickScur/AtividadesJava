/*2 – Fazer um programa que calcule a tabuada de qualquer número, e o limite de
cálculo deve ser definido pelo usuário:*/
package br.edu.ifcvideira.Lista4;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double a;
		int b=0;
		int limite;
		
		System.out.println("Digite o numero a ser multiplicado");
		a = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite o limite do calculo");
		limite = Integer.parseInt(in.nextLine());
		
		while(b < limite) {
			b++;
			System.out.println(" "+a+" X "+b+" = "+a*b);
		}
		
		
	}
}
