/*11 - Fa�a um algoritmo para calcular e exibir o valor de uma presta��o em atraso.
 *  prestacao_atrasada <- prestacao + (prestacao*(taxa/100)*num_dias_atraso),
 *   taxa � o percentual de juros por dia, num_dias_atraso � o n�mero de dias em atraso 
 *   e presta��o � o valor da presta��o normal. O valor da presta��o,
 *    a taxa e o n�mero de dias em atraso devem ser fornecidos pelo usu�rio.
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
		
		System.out.println("O valor da prestacao atrasa � de R$"+prestacaoAtrasada);
	}
}
