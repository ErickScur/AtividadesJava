/*9 - Fa�a um algoritmo para calcular e exibir um sal�rio reajustado em 23,75%.
 *  O sal�rio atual deve ser fornecido pelo usu�rio.
 */
package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double salario;
		double salarioReajustado;
		
		System.out.println("Digite o salario: ");
		salario = Double.parseDouble(in.nextLine());
		
		salarioReajustado = salario + salario * 23.75/100;
		System.out.println("O salario reajustado �: "+salarioReajustado);
	}
}
