package br.edu.ifcvideira.Lista10;

import javax.swing.JOptionPane;

public class Ex5CamInferior extends Ex4Vip {
	private String localizacao;
	
	public Ex5CamInferior() {
	}

	public Ex5CamInferior(double valor, String tipo, String localizacao) {
		super(valor, tipo);
		this.localizacao = localizacao;
	}
	
	
	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	
	public void imprime() {
		JOptionPane.showMessageDialog(null, "camarote inferior Dados do ingresso: \n"
				+ "Ingresso: "+this.getTipo()+"\n"
						+ "Localiza��o: "+this.getLocalizacao()+"\n"
							+ "Valor: R$"+retornaVl());
	}
	

	public double retornaVl() {
		return this.getValor() * 1.5;
	}
	
	

}
