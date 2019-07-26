package br.edu.ifcvideira.Lista9;

public class Ex1Contador {
	private int numero;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void incrementa() {
		this.setNumero(this.getNumero() +1);
	}
	
	public void decrementa() {
		this.setNumero(this.getNumero() -1);
	}
}
