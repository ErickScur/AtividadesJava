package br.edu.ifcvideira.Lista10;

import javax.swing.JOptionPane;

public class Ex2Principal {
	public static void main(String[] args) {
		Ex2Funcionario fu;
		
		int op;
		String nome;
		String cargo;
		double sal;
		int matricula;
		String turno;
		
		for(;;) {
			op = Integer.parseInt(JOptionPane.showInputDialog(
					"Qual tipo de funcion�rio deseja cadastrar: \n"
					+ " 1 - Gerente: \n"
					+ " 2 - Assistente T�cnico \n"
					+ " 3 - Assistente Administrativo \n"
					+ " 4 - Sair"));
			if(op==4) {break;}
			
			nome = String.valueOf(JOptionPane.showInputDialog("Qual o nome do Funcionario: "));
			sal = Double.parseDouble(JOptionPane.showInputDialog("Qual o salario de "+nome));
			
			if (op==1) {
				cargo = "Gerente";
				fu = new Ex2Gerente(nome, sal, cargo);
				
				fu.imprime();
			} else if(op==2) {
				cargo = "Assistente Tecnico";
				fu = new Ex2AssTec(nome, sal, cargo);
				
				fu.imprime();
			} else if(op==3) {
				cargo = "Assistente Adiministrativo";
				matricula = Integer.parseInt(JOptionPane.showInputDialog("Qual a matricula: "));
				turno = String.valueOf(JOptionPane.showInputDialog("Qual o turno: (Diurno/Noturno)"));
				fu = new Ex2AssAdm(nome, sal, cargo, matricula, turno);
				
				fu.imprime();
			}
				
		}
		
		
		
		
	}
}
