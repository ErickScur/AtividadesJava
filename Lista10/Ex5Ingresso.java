package br.edu.ifcvideira.Lista10;

import javax.swing.JOptionPane;

public class Ex5Ingresso {
	private double valor;
	private String tipo;
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public Ex5Ingresso() {
	}
	
	public Ex5Ingresso(double valor, String tipo) {
		super();
		this.valor = valor;
		this.tipo = tipo;
	}
	
	
	public double retornaVl() {
		return this.getValor();
	}
	
	public void imprime() {
		JOptionPane.showMessageDialog(null, "ingresso qualquer coisa que voc queira Dados do ingresso: \n"
				+ "Ingresso: "+this.getTipo()+"\n"
						+ "Valor: R$"+retornaVl());
	}

	

}
