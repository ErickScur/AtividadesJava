package br.edu.ifcvideira.Lista10;

import javax.swing.JOptionPane;

public class Ex6Imovel {
	private String end;
	private double preco;
	
	public Ex6Imovel(String end, double preco) {
		this.end = end;
		this.preco = preco;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double calculaPreco() {
		return this.getPreco();
	}
	
	public void imprime() {
		JOptionPane.showMessageDialog(null, "Os dados do imovel s�o: \n"
				+ "Endere�o: "+this.getEnd()+"\n"
						+ "Pre�o: "+calculaPreco());
	}

}
