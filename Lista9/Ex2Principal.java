package br.edu.ifcvideira.Lista9;

import javax.swing.JOptionPane;

public class Ex2Principal {
	public static void main(String[] args) {
		Ex2Troca troca = new Ex2Troca();
		
		
		troca.setN1(Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 1: ")));
		troca.setN2(Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 2: ")));

		JOptionPane.showConfirmDialog(null, "Os numeros digitados: "+troca.getN1()+" "+" "+troca.getN2());
		troca.troca();
		JOptionPane.showMessageDialog(null, "Valores Trocados: "+troca.getN1()+" "+" "+troca.getN2());
	}
}
