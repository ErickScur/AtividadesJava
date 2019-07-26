package br.edu.ifcvideira.Lista11;

import javax.swing.JOptionPane;

public class Ex2Animal {
	private String nome;
	private double comprimento;
	private int patas;
	private String cor;
	private String ambiente;
	private double velocidade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	public Ex2Animal() {
	}
	
	public Ex2Animal(String nome, double comprimento, int patas, String cor, String ambiente,
			double velocidade) {
		this.nome = nome;
		this.comprimento = comprimento;
		this.patas = patas;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velocidade = velocidade;
	}
	
	public void imprime() {
		JOptionPane.showMessageDialog(null, "As informa��es s�o: \n"
				+ "Animal: "+this.getNome()+"\n"
				+ "Comprimento: "+this.getComprimento()+"\n"
				+ "Numero de patas: "+this.getPatas()+"\n"
				+ "Cor: "+this.getCor()+"\n"
				+ "Ambiente: "+this.getAmbiente()+"\n"
				+ "Velocidade: "+this.getVelocidade());	
	}
	
	
	
	

}
