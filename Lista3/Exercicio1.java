/* 1 � Desenvolva um algoritmo que calcule o imposto de renda de um contribuinte
considerando que os dados do contribuinte s�o: n�mero do CPF, n�mero de
dependentes e renda mensal. Para o contribuinte ser� feito um desconto de 5% de
sal�rio m�nimo por dependente (m�ximo de 3 dependentes 15%).
Os valores da al�quota para c�lculo do imposto s�o:
Renda l�quida Al�quota

at� 2 sal�rios m�nimos     Isento
2..3 sal�rios m�nimos       5%
3..5 sal�rios m�nimos       10%
5..7 sal�rios m�nimos       15%
acima de 7 sal�rios m�nimos 20%

Deve ser solicitado o valor atual do sal�rio m�nimo ao iniciar o algoritmo
(R$954,00)
*/
package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String cpf;
		int dependentes;
		double renda;
		double salarioMin;
		double imposto;
		double desconto = 0;
		
		
		System.out.println("Informe o CPF do contribuinte: ");
		cpf = String.valueOf(in.nextLine());
		
		System.out.println("Informe o numero de dependentes: ");
		dependentes = Integer.parseInt(in.nextLine());
		
		System.out.println("Informe a renda do contribuinte: ");
		renda = Double.parseDouble(in.nextLine());
		
		System.out.println("Informe o salario minimo atual: ");
		salarioMin = Double.parseDouble(in.nextLine());
		
		if(dependentes == 1) {
			desconto = 0.05;
	
		} else if(dependentes == 2) {
			desconto = 0.10;
			
		} else if(dependentes >= 3) {
			desconto = 0.15;
			
		}
		
		if(renda <= (2*salarioMin)) {
			System.out.println("O contribuinte do CPF: "+cpf+", est� isento.");
			
		} else if ((renda>(salarioMin*2))&&(renda<= (salarioMin*3))) {
			imposto = renda*0.05 - (salarioMin*desconto);
			System.out.println("O contribuinte do CPF: "+cpf+", tem que pagar R$"+imposto);
			
		} else if ((renda>(salarioMin*3))&&(renda<= (salarioMin*5))) {
			imposto = renda*0.1 - (salarioMin*desconto);
			System.out.println("O contribuinte do CPF: "+cpf+", tem que pagar R$"+imposto);
			
		} else if ((renda>(salarioMin*5))&&(renda<= (salarioMin*7))) {
			imposto = renda*0.15 - (salarioMin*desconto);
			System.out.println("O contribuinte do CPF: "+cpf+", tem que pagar R$"+imposto);
			
		} else if (renda > (salarioMin*7)) {
			imposto = renda*0.2 - (salarioMin*desconto);
			System.out.println("O contribuinte do CPF: "+cpf+", tem que pagar R$"+imposto);
		}
		
		
		
	}
}

