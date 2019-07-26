/*11 - Faça um algoritmo para calcular e exibir o valor de uma prestação em atraso.
 *  prestacao_atrasada <- prestacao + (prestacao*(taxa/100)*num_dias_atraso),
 *   taxa é o percentual de juros por dia, num_dias_atraso é o número de dias em atraso 
 *   e prestação é o valor da prestação normal. O valor da prestação,
 *    a taxa e o número de dias em atraso devem ser fornecidos pelo usuário.
 */
package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double prestacao;
		double prestacaoAtrasada;
		double dias;
		double taxa;
		
		System.out.println("Digite o valor da prestacao normal: ");
		prestacao = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite o numero de dias atrasados: ");
		dias = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite o percentual de juros por dia: ");
		taxa = Double.parseDouble(in.nextLine());
	
		prestacaoAtrasada = prestacao + (prestacao *(taxa/100)* dias);
		
		System.out.println("O valor da prestacao atrasa é de R$"+prestacaoAtrasada);
	}
}
