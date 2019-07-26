/*3 - Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma
mensagem que diga se ela poderá ou não votar este ano (não é necessário
considerar o mês em que a pessoa nasceu).
 */
package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double nascimento;
		double anoAtual;
		
		System.out.println("Digite o ano atual:");
		anoAtual = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite o ano de nascimento:");
		nascimento = Double.parseDouble(in.nextLine());
		
		if (anoAtual - nascimento >= 16) {
			System.out.println("Pode votar");
		}else {
			System.out.println("Não pode votar");
		}
	}
}
