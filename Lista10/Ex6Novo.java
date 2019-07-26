package br.edu.ifcvideira.Lista10;

import javax.swing.JOptionPane;

public class Ex6Novo extends Ex6Imovel {
	
	public Ex6Novo(String end, double preco) {
		super(end, preco);
		// TODO Auto-generated constructor stub
	}
	
	public double calculaPreco() {
		return this.getPreco() * 1.1;
	}
	
	public void imprime() {
		JOptionPane.showMessageDialog(null, "Os dados do imovel s�o: \n"
				+ "Endere�o: "+this.getEnd()+"\n"
						+ "Pre�o: "+calculaPreco());
	}

	

}
