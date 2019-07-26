package br.edu.ifcvideira.Lista10;

import javax.swing.JOptionPane;

public class Ex5Vip extends Ex4Ingresso{

	public Ex5Vip() {
	}

	public Ex5Vip(double valor, String tipo) {
		super(valor, tipo);

	}
	

	public void imprime() {
		JOptionPane.showMessageDialog(null, "vip Dados do ingresso: \n"
				+ "Ingresso: "+this.getTipo()+"\n"
						+ "Valor: R$"+retornaVl());
	}
	
	
	public double retornaVl() {
		return this.getValor() * 1.3;
	}

}
