package br.edu.ifcvideira.Lista11;

import javax.swing.JOptionPane;

public class Ex3Eletrodomestico extends Ex3Produto{
	private double voltagem;

	public double getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(double voltagem) {
		this.voltagem = voltagem;
	}
	
	public Ex3Eletrodomestico() {
	}

	public Ex3Eletrodomestico(String codigo, String descricao, double valor, double voltagem) {
		super(codigo, descricao, valor);
		this.voltagem = voltagem;
	}
	
	public void imprime() {
		JOptionPane.showMessageDialog(null, "As informa��es s�o: \n"
				+ "Codigo: "+this.getCodigo()+"\n"
						+ "Descri��o: "+this.getDescricao()+"\n"
							+ "Voltagem: "+this.getVoltagem()+"\n"
								+ "Valor: R$"+this.getValor());
	}
	
	
}
