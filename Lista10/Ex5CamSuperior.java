package br.edu.ifcvideira.Lista10;

import javax.swing.JOptionPane;

public class Ex5CamSuperior extends Ex4Vip {
	public Ex5CamSuperior() {
	}

	public Ex5CamSuperior(double valor, String tipo) {
		super(valor, tipo);
	}
	
	public void imprime() {
		JOptionPane.showMessageDialog(null, "camarote superior Dados do ingresso: \n"
				+ "Ingresso: "+this.getTipo()+"\n"
							+ "Valor: R$"+retornaVl());
	}

	
	

	public double retornaVl() {
		return this.getValor() * 1.7;
	}

}
