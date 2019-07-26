package br.edu.ifcvideira.Lista10;

import javax.swing.JOptionPane;

public class Ex2AssAdm extends Ex2Funcionario{
	
	private int matricula;
	private String turno;
	
	public Ex2AssAdm() {
		
	}
		
	public Ex2AssAdm(String nome, double salario, String cargo, int matricula, String turno) {
		super(nome, salario, cargo);
		this.matricula = matricula;
		this.turno = turno;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	
	public double calculaSalario () {
		if(this.getTurno().equals("Noturno")) {
			return	this.getSalario() * 1.3 ;	
		}else {
			return this.getSalario();
		}
	}
	
	public void imprime() {
		JOptionPane.showMessageDialog(null, "Dados do funcionario \n"
				+ "Cargo: "+this.getCargo()+"\n"
						+ "Nome: "+this.getNome()+"\n"
								+ "Turno: "+this.getTurno()+"\n"
										+ "Matricula: "+this.getMatricula()+"\n"
												+ "Salario: R$"+calculaSal());
	}
	
	
	

	
}
