package br.edu.ifcvideira.Lista10;

import javax.swing.JOptionPane;

public class Ex1Principal {
	public static void main(String[] args) {
		
		Ex1AssAdm eaa = new Ex1AssAdm();
		Ex1AssTec eat = new Ex1AssTec();
		Ex1Gerente eg = new Ex1Gerente();
		
		int op;
		
		for (;;) {
			op = Integer.parseInt(JOptionPane.showInputDialog("Qual tipo de funcion�rio deseja cadastrar: \n"
					+ " 1 - Gerente: \n"
					+ " 2 - Assistente T�cnico \n"
					+ " 3 - Assistente Administrativo \n"
					+ " 4 - Sair"));
			
			if (op == 1) {
				eg.setNome(String.valueOf(JOptionPane.showInputDialog("Qual � o nome do gerente?")));
				eg.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Qual � o sal�rio do gerente? " + eg.getNome())));
				eg.setCargo("Gerente");
				
				JOptionPane.showMessageDialog(null, "Os dados do gerente s�o: \n"
						+ "Nome: " + eg.getNome()+ "\n"
						+ "Sal�rio: R$ " + eg.calculaSalario());
			}else if (op == 2 ) {
				eat.setNome(String.valueOf(JOptionPane.showInputDialog("Qual � o nome do Assitente t�cnico?")));
				eat.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Qual � o sal�rio do Assitente t�cnico? " + eat.getNome())));
				eat.setCargo("Assitente t�cnico");
				
				JOptionPane.showMessageDialog(null, "Os dados do Assistente t�cnico s�o: \n"
						+ "Nome: " + eat.getNome()+ "\n"
						+ "Sal�rio: R$ " + eat.calculaSalario());
				
			} else if(op == 3) {
				eaa.setNome(String.valueOf(JOptionPane.showInputDialog("Qual � o nome do Assitente administrativo?")));
				eaa.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Qual � o sal�rio do Assitente administrativo? " + eaa.getNome())));
				eaa.setCargo("Assitente Administrativo");
				eaa.setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Qual � a matricula de " + eaa.getNome())));
				eaa.setTurno(String.valueOf(JOptionPane.showInputDialog("Qual � o seu turno? (Diurno / Noturno)")));
				
				JOptionPane.showMessageDialog(null, "Os dados do Assistente administrativo s�o: \n"
						+ "Nome: " + eaa.getNome()+ "\n"
						+ "Matr�cula: " + eaa.getMatricula() + " \n"
						+ "Turno: " + eaa.getTurno() + " \n"
						+ "Sal�rio: R$ " + eaa.calculaSalario());
			}else if (op == 4) {
				break;
			}else {
				JOptionPane.showMessageDialog(null, "Op��o inv�lida");
			}
		}
	}

}
