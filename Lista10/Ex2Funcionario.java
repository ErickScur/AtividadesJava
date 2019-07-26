package br.edu.ifcvideira.Lista10;

import javax.swing.JOptionPane;

public class Ex2Funcionario {

	private String nome;
	private double salario;
	private String cargo;
	
	public Ex2Funcionario() {
	}

	public Ex2Funcionario(String nome, double salario, String cargo) {
		this.nome = nome;
		this.salario = salario;
		this.cargo = cargo;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public double calculaSal() {
		return this.getSalario();
	}
	
	public void imprime() {
		JOptionPane.showMessageDialog(null, "Dados do funcionario: \n"
				+ "Nome: "+this.getNome()+"\n"
						+ "Salario: R$"+calculaSal());
	}
	
}
