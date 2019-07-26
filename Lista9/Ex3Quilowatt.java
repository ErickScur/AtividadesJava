package br.edu.ifcvideira.Lista9;

public class Ex3Quilowatt {
	private double quantGasta;
	private double salMinimo;
	
	public double getQuantGasta() {
		return quantGasta;
	}
	public void setQuantGasta(double quantGasta) {
		this.quantGasta = quantGasta;
	}
	public double getSalMinimo() {
		return salMinimo;
	}
	public void setSalMinimo(double salMinimo) {
		this.salMinimo = salMinimo;
	}
	
	public double valorQuilowatt() {
		return this.getSalMinimo()/7/100;
	}
	
	public double valorPagar() {
		return valorQuilowatt() * this.getQuantGasta();
	}
	
	public double valorPagarDesconto() {
		return valorPagar() * 0.9;
	}
	
}
