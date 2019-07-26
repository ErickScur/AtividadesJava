/*3 - A empresa “MultiSoft” decidiu conceder um aumento de salário para os seus
funcionários de acordo com a tabela abaixo:
Salário Atual R$ Índice de aumento
0 a 300,00 10%
300,01 a 600,00 11%
600,01 a 900,00 12%
900,01 a 1500,00 6%
1500,01 a 2000,00 3%
Acima de 2000 Sem aumento
Escrever um algoritmo que lê, para cada funcionário, o seu nome e o seu salário
atual, escrevendo depois o nome do funcionário, seu salário atual, o percentual de
seu aumento e o valor do salário corrigido.
*/
package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String nome;
		double salario;
		double salarioCorrigido;
		
		System.out.println("Digite o Nome do Funcionario: ");
		nome = String.valueOf(in.nextLine());
		
		System.out.println("Digite o salario atual deste funcionario: ");
		salario = Double.parseDouble(in.nextLine());
		
		if (salario <= 300) {
			salarioCorrigido = salario + (salario*0.1);
			System.out.println("O salario de: "+nome+" que era de: " +salario+" R$ teve um aumento de 10%, sendo então: "+salarioCorrigido+"R$.");
			
		} else if ((salario > 300)&&(salario <= 600)) {
			salarioCorrigido = salario +(salario*0.11);
			System.out.println("O salario de: "+nome+" que era de: " +salario+" R$ teve um aumento de 11%, sendo então: "+salarioCorrigido+"R$.");
			
		} else if ((salario > 600)&&(salario <= 900)) {
			salarioCorrigido = salario + (salario*0.12);
			System.out.println("O salario de: "+nome+" que era de: " +salario+" R$ teve um aumento de 12%, sendo então: "+salarioCorrigido+"R$.");
			
		} else if ((salario > 900)&&(salario <= 1500)) {
			salarioCorrigido = salario + (salario*0.6);
			System.out.println("O salario de: "+nome+" que era de: " +salario+" R$ teve um aumento de 6%, sendo então: "+salarioCorrigido+"R$.");
			
		} else if ((salario > 1500)&&(salario <= 2000)) {
			salarioCorrigido = salario + (salario*0.3);
			System.out.println("O salario de: "+nome+" que era de: " +salario+" R$ teve um aumento de 3%, sendo então: "+salarioCorrigido+"R$.");
			
		} else if (salario > 2000) {
			System.out.println("O salario de: "+nome+" que era de: " +salario+" R$ não teve nenhum aumento.");
			 
		}
		
	}
	}

