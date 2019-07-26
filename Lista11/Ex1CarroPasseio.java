package br.edu.ifcvideira.Lista11;

import javax.swing.JOptionPane;

public class Ex1CarroPasseio extends Ex1Veiculo {
	private String cor;
	private String modelo;

	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public Ex1CarroPasseio() {
	}
	
	public Ex1CarroPasseio(int peso, int velMax, double preco, String cor, String modelo) {
		super(peso, velMax, preco);
		this.cor = cor;
		this.modelo = modelo;
	}
	
	public double calculaPreco() {
		return this.getPreco()*0.85;
	}
	
	public void imprime() {
		JOptionPane.showMessageDialog(null, "Dados do ve�culo: \n"
				+ "Peso: "+this.getPeso()+"\n"
				+ "Velocidade Maxima: "+this.getVelMax()+"\n"
				+ "Cor: "+this.getCor()+"\n"
				+ "Modelo: "+this.getModelo()+"\n"
				+ "Pre�o: "+calculaPreco());
	}

	

	
	
}
