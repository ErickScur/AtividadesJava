/*2 - Ler as notas da 1a
e 2a avalia��o de um aluno. Calcular a m�dia aritm�tica
simples e escrever uma mensagem que diga se o aluno foi ou n�o aprovado
(considerar que se a nota for igual ou maior que 7 o aluno � aprovado). Escrever
tamb�m a m�dia calculada.
*/
package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double nota1;
		double nota2;
		double media;
		
		System.out.println("Digite a primeira nota");
		nota1 = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite a segunda nota");
		nota2 = Double.parseDouble(in.nextLine());
		
		media = (nota1 + nota2)/2;
		
		if (media >= 7) {
			System.out.println("O aluno foi aprovado");
		}else {
			System.out.println("O aluno foi reprovado");
		}
				
	}
}
