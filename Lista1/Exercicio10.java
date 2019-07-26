/*10 - Faça um algoritmo para calcular e exibir do salário líquido de um professor,
onde o número de horas, o valor da hora e o percentual do INSS devem ser fornecidos pelo usuário:
salario_bruto <- num_hora_aula * valor_hora_aula 
salario_liquido <- salario_bruto – (salario_bruto * percentual_INSS). 
*/
package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double horas;
		double valorHora;
		double inss;
		double salarioBruto;
		double salarioLiquido;
		
		System.out.println("Digite o numero de horas que o professor trabalhou: ");
		horas = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite o valor da hora: ");
		valorHora = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite o valor do percentual do INSS: ");
		inss = Double.parseDouble(in.nextLine());
		
		salarioBruto = horas * valorHora;
		
		salarioLiquido= salarioBruto - (salarioBruto * inss/100);
		
		System.out.println("O salario liquido é: R$"+salarioLiquido);
		
	}
}

