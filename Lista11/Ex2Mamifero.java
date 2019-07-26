package br.edu.ifcvideira.Lista11;

import javax.swing.JOptionPane;

public class Ex2Mamifero extends Ex2Animal {
	private String alimento;

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	public Ex2Mamifero() {
	}

	public Ex2Mamifero(String nome, double comprimento, int patas, String cor, String ambiente,
			double velocidade, String alimento) {
		super(nome, comprimento, patas, cor, ambiente, velocidade);
		this.alimento = alimento;
	}
	
	public void imprime() {
		JOptionPane.showMessageDialog(null, "As informa��es s�o: \n"
				+ "Animal: "+this.getNome()+"\n"
				+ "Comprimento: "+this.getComprimento()+"\n"
				+ "Numero de patas: "+this.getPatas()+"\n"
				+ "Cor: "+this.getCor()+"\n"
				+ "Ambiente: "+this.getAmbiente()+"\n"
				+ "Velocidade: "+this.getVelocidade()+"\n"
				+ "Alimento: "+this.getAlimento());	
	}
	

}
