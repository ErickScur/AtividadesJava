package br.edu.ifcvideira.Lista9;

public class Ex4Pessoa {
	private String nome;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void fazAniversario() {
		this.setIdade(this.getIdade()+1);
	}
}
