/*6 - Uma loja fornece 5% de desconto para funcion�rios e 10% de desconto para
clientes especiais. Fa�a um programa que calcule o valor total a ser pago por uma
pessoa. O programa dever� ler o valor total da compra efetuada e um c�digo que
identifique se o comprador � um cliente comum ou um dos dois tipos de clientes
que recebem desconto. Utilize 1 para funcion�rio, 2 para cliente especial e
qualquer outro valor � cliente comum.
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
	
	System.out.println("Digite 1 se voc� � funcionario ou 2 se voc� � um cliente especial");
	codigo = Integer.valueOf(in.nextLine());
	
	
	if(codigo == 1) {
		total = total - (total*0.05);
		System.out.println("Seu total a pagar � de: "+total+"R$");
		
	} else if(codigo == 2) {
		total = total - (total*0.1);
		System.out.println("Seu total a pagar � de: "+total+"R$");
		
	}
	}
}
