/*4 - Escreva um programa que informe se existe estoque para atender um pedido
feito a uma f�brica. O programa dever� receber como entradas o n�mero de itens
em estoque e o n�mero de itens a serem fornecidos, e dar� como sa�da o estoque
atualizado (itens em estoque menos itens a ser fornecidos) ou uma mensagem
indicando n�o haver itens suficientes em estoque para atender ao pedido.
*/
package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int estoque;
		int fornecidos;
		
		System.out.println("Digite o numero de produtos em estoque ");	
		estoque=Integer.parseInt(in.nextLine()); 
	}
}
