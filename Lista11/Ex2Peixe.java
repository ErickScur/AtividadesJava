package br.edu.ifcvideira.Lista11;

import javax.swing.JOptionPane;

public class Ex2Peixe extends Ex2Animal {
	private String carac;

	public String getCarac() {
		return carac;
	}

	public void setCarac(String carac) {
		this.carac = carac;
	}

	public Ex2Peixe(String carac) {
		super();
		this.carac = carac;
	}

	public Ex2Peixe() {
	}

	public Ex2Peixe(String nome, double comprimento, int patas, 
			String cor, String ambiente, double velocidade, String carac) {
		super(nome, comprimento, patas, cor, ambiente, velocidade);
		this.carac = carac;
	}
	
	public void imprime() {
		JOptionPane.showMessageDialog(null, "As informa��es s�o: \n"
				+ "Animal: "+this.getNome()+"\n"
				+ "Comprimento: "+this.getComprimento()+"\n"
				+ "Numero de patas: "+this.getPatas()+"\n"
				+ "Cor: "+this.getCor()+"\n"
				+ "Ambiente: "+this.getAmbiente()+"\n"
				+ "Velocidade: "+this.getVelocidade()+"\n"
				+ "Caracter�sticas: "+this.getCarac());	
	}
	
	
	

}
