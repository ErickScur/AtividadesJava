package br.edu.ifcvideira.Lista11;

import javax.swing.JOptionPane;

public class Ex1Veiculo {
	private int peso;
	private int velMax;
	private double preco;
	
	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getVelMax() {
		return velMax;
	}


	public void setVelMax(int velMax) {
		this.velMax = velMax;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Ex1Veiculo() {
	}


	public Ex1Veiculo(int peso, int velMax, double preco) {
		this.peso = peso;
		this.velMax = velMax;
		this.preco = preco;
	}
	
	public double calculaPreco() {
		return this.getPreco() * 0.9;
	}
	
	public void imprime() {
		JOptionPane.showMessageDialog(null, "Dados do ve�culo: \n"
				+ "Peso: "+this.getPeso()+"\n"
				+ "Velocidade Maxima: "+this.getVelMax()+"\n"
				+ "Pre�o: "+calculaPreco());
	}
	
	
	
	
	
}
