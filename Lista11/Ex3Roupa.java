package br.edu.ifcvideira.Lista11;

import javax.swing.JOptionPane;

public class Ex3Roupa extends Ex3Produto {
	private double tamanho;
	private String cor;
	
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public Ex3Roupa() {		
	}
	
	public Ex3Roupa(String codigo, String descricao, double valor, double tamanho, String cor) {
		super(codigo, descricao, valor);
		this.tamanho = tamanho;
		this.cor = cor;
	}
	
	public void imprime() {
		JOptionPane.showMessageDialog(null, "As informa��es s�o: \n"
				+ "Codigo: "+this.getCodigo()+"\n"
						+ "Descri��o: "+this.getDescricao()+"\n"
							+ "Tamanho: "+this.getTamanho()+"\n"
									+ "Cor: "+this.getCor()+"\n"
										+ "Valor: R$"+this.getValor());
	}
	
	
	

}
