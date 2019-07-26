package br.edu.ifcvideira.Lista11;

import javax.swing.JOptionPane;

public class Ex1Caminhao extends Ex1Veiculo {
	private int ton;
	private int altMax;
	private double comprimento;
	
	public Ex1Caminhao() {
	}
	
	public Ex1Caminhao(int peso, int velMax, double preco, int ton, int altMax, double comprimento) {
		super(peso, velMax, preco);
		this.ton = ton;
		this.altMax = altMax;
		this.comprimento = comprimento;
		
	}

	public int getTon() {
		return ton;
	}

	public void setTon(int ton) {
		this.ton = ton;
	}

	public int getAltMax() {
		return altMax;
	}

	public void setAltMax(int altMax) {
		this.altMax = altMax;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	
	public double calculaPreco() {
		return this.getPreco()*0.8;
	}

	public void imprime() {
		JOptionPane.showMessageDialog(null, "Dados do ve�culo: \n"
				+ "Peso: "+this.getPeso()+"\n"
				+ "Velocidade Maxima: "+this.getVelMax()+"\n"
				+ "Capacidade: "+this.getTon()+"\n"
				+ "Altura maxima: "+this.getAltMax()+"\n"
				+ "Comprimento: "+this.getComprimento()+"\n"
				+ "Pre�o: "+calculaPreco());
	}
		
	
	
	
	
	
	
	

}
