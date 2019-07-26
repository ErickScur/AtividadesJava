package br.edu.ifcvideira.Lista11;

import javax.swing.JOptionPane;

public class Ex3Alimento extends Ex3Produto{
	private String tipo;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public Ex3Alimento() {
	}

	public Ex3Alimento(String codigo, String descricao, double valor, String tipo) {
		super(codigo, descricao, valor);
		this.tipo = tipo;
	}
	
	public void imprime() {
		JOptionPane.showMessageDialog(null, "As informa��es s�o: \n"
				+ "Codigo: "+this.getCodigo()+"\n"
						+ "Descri��o: "+this.getDescricao()+"\n"
								+ "Tipo: "+this.getTipo()+"\n"
								+ "Valor: R$"+this.getValor());
	}
	
	
}
