//Antes do racionamento de energia ser decretado, quase ningu�m falava em
//quilowatts. Mas, agora, todos incorporam essa palavra em seu vocabul�rio.
//	Sabendo-se que 100 quilowatts de energia custam um s�timo do sal�rio m�nimo,
//fazer uma classe em java que:
//	-Tenha dois atributos: um que represente o valor do sal�rio m�nimo e
//		outro que represente a quantidade de quilowatts gasta por uma resid�ncia;
//	-Encapsule esses atributos;
//	-Crie um m�todo que retorne o valor em reais de cada quilowatt;
//	-Crie um m�todo que retorne o valor em reais que a resid�ncia ter� que pagar;
//	-Crie um m�todo que retorne o valor em reais que a resid�ncia ter� que pagar com desconto de 10%;
//		Crie um m�todo main que:
//			-Atribua um valor aos atributos da classe;
//			-E que mostre na tela a quantidade em reais que a resid�ncia vai pagar, com e sem o desconto.

package br.edu.ifcvideira.Lista9;

import java.text.DecimalFormat;

import javax.swing.*;

public class Ex3Principal {
	public static void main(String[] args) {
		Ex3Quilowatt qw = new Ex3Quilowatt();
		DecimalFormat df = new DecimalFormat("0.00");
		
		qw.setSalMinimo(Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do salario minimo: ")));
		qw.setQuantGasta(Double.parseDouble(JOptionPane.showInputDialog("Quantos QuiloWatts foram gastos: ")));
		
		JOptionPane.showMessageDialog(null, "Voce tera que pagar: \n"
				+ "Sem desconto: R$"+df.format(qw.valorPagar())+"\n"
				+ "Com desconto: R$"+df.format(qw.valorPagarDesconto()));
	}
}
