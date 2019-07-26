package br.edu.ifcvideira.Lista10;



public class Ex4CamSuperior extends Ex4Vip {
	public Ex4CamSuperior() {
	}

	public Ex4CamSuperior(double valor, String tipo) {
		super(valor, tipo);
	}
	
	
	
	

	public double retornaVl() {
		return this.getValor() * 1.7;
	}

}
