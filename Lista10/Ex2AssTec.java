package br.edu.ifcvideira.Lista10;

import javax.swing.JOptionPane;

public class Ex2AssTec extends Ex2Funcionario {
	public Ex2AssTec() {
	}

	public Ex2AssTec(String nome, double salario, String cargo) {
		super(nome, salario, cargo);
	}

	public double calculaSalario () {
		return	this.getSalario() * 1.2 ;
	}
	
	public void imprime() {
		JOptionPane.showMessageDialog(null, "Dados do funcionario \n"
				+ "Cargo: "+this.getCargo()+"\n"
						+ "Nome: "+this.getNome()+"\n"
								+ "Salario: R$"+calculaSal());
	}
	
}
