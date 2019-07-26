/*6 - Uma loja fornece 5% de desconto para funcionários e 10% de desconto para
clientes especiais. Faça um programa que calcule o valor total a ser pago por uma
pessoa. O programa deverá ler o valor total da compra efetuada e um código que
identifique se o comprador é um cliente comum ou um dos dois tipos de clientes
que recebem desconto. Utilize 1 para funcionário, 2 para cliente especial e
qualquer outro valor é cliente comum.
*/
package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Execicio6 {
	public static void main(String[] args) {
		
	Scanner in = new Scanner(System.in);
	
	int codigo;
	double total;
	
	System.out.println("Informe o total de compra:");
	total = Double.parseDouble(in.nextLine());
	
	System.out.println("Digite 1 se você é funcionario ou 2 se você é um cliente especial");
	codigo = Integer.valueOf(in.nextLine());
	
	
	if(codigo == 1) {
		total = total - (total*0.05);
		System.out.println("Seu total a pagar é de: "+total+"R$");
		
	} else if(codigo == 2) {
		total = total - (total*0.1);
		System.out.println("Seu total a pagar é de: "+total+"R$");
		
	}
	}
}
