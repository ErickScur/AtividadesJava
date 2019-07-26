package br.edu.ifcvideira.Lista10;

import javax.swing.JOptionPane;

public class Ex6Velho extends Ex6Imovel {

	public Ex6Velho(String end, double preco) {
		super(end, preco);
	}
	
	public double calculaPreco() {
		return this.getPreco() * 0.9;
	}
	
	public void imprime() {
		JOptionPane.showMessageDialog(null, "Os dados do imovel s�o: \n"
				+ "Endere�o: "+this.getEnd()+"\n"
						+ "Pre�o: "+calculaPreco());
	}

}
