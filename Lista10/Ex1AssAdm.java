package br.edu.ifcvideira.Lista10;

public class Ex1AssAdm extends Ex1Funcionario {
	private int matricula;
	private String turno;
	
	public Ex1AssAdm() {
		
	}
		
	public Ex1AssAdm(String nome, double salario, String cargo, int matricula, String turno) {
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
}
