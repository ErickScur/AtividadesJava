package br.edu.ifcvideira.Lista10;


public class Ex4CamInferior extends Ex4Vip {
	private String localizacao;
	
	public Ex4CamInferior() {
	}

	public Ex4CamInferior(double valor, String tipo, String localizacao) {
		super(valor, tipo);
		this.localizacao = localizacao;
	}
	
	
	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	
	
	

	public double retornaVl() {
		return this.getValor() * 1.5;
	}
	
	

}
