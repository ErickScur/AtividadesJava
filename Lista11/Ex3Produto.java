package br.edu.ifcvideira.Lista11;

import javax.swing.JOptionPane;

public class Ex3Produto {
	private String codigo;
	private String descricao;
	private double valor;
	
	
	public String getCodigo() {
		return codigo;
	}



	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}



	public String getDescricao() {
		return descricao;
	}



	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



	public double getValor() {
		return valor;
	}



	public void setValor(double valor) {
		this.valor = valor;
	}


	public Ex3Produto(){
	}

	public Ex3Produto(String codigo, String descricao, double valor) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.valor = valor;
	}
	
	public void imprime() {
		JOptionPane.showMessageDialog(null, "As informa��es s�o: \n"
				+ "Codigo: "+this.getCodigo()+"\n"
						+ "Descri��o: "+this.getDescricao()+"\n"
								+ "Valor: R$"+this.getValor());
	}
	

	
	

}
