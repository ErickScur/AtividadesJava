package br.edu.ifcvideira.Lista10;



public class Ex4Vip extends Ex4Ingresso{

	public Ex4Vip() {
	}

	public Ex4Vip(double valor, String tipo) {
		super(valor, tipo);

	}
	

	
	
	public double retornaVl() {
		return this.getValor() * 1.3;
	}

}
