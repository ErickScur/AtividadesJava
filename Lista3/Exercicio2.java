/*2 - Elabore um algoritmo que efetue a leitura do nome e do sexo de uma pessoa
(pode ser o número 1 para masculino, 2 para feminino), apresentando como saída
uma das seguintes mensagens: “Excelentíssimo Sr.”, para o sexo informado como
masculino, ou a mensagem “Excelentíssima Sra.”, para o sexo informado como
feminino. Apresente também o nome da pessoa.
*/
package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String nome;
		int sexo;
		
		System.out.println("Digite o nome da pessoa");
		nome = String.valueOf(in.nextLine());
		
		System.out.println("Digite 1 se a pessoa é homem e 2 se a pessoa é mulher");
		sexo=Integer.parseInt(in.nextLine());
		
		if (sexo == 1) {
			System.out.println("Excelentissimo Sr "+nome);
		}else if(sexo == 2) {
			System.out.println("Excelentissima Sra "+nome);
		}
	}
}
