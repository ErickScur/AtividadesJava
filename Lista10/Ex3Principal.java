package br.edu.ifcvideira.Lista10;

import javax.swing.JOptionPane;

public class Ex3Principal {
	public static void main(String[] args) {
	int op;
	

	Ex3Cachorro cachorro = new Ex3Cachorro();
	Ex3Gato gato = new Ex3Gato();
	
		JOptionPane.showMessageDialog(null, "Adicione um animal");
	op = Integer.parseInt(JOptionPane.showInputDialog("1 - Gato \n"
			+ "2 - Cachorro \n"
			+ "3 - Fechar"));
	
	switch (op) {
	case 3:
		break;
	case 1:
		
		gato.setNome ( String.valueOf(JOptionPane.showInputDialog("Qual o nome do Gato ?")));
		gato.setRaca ( String.valueOf(JOptionPane.showInputDialog("Qual a raça do " +gato.getNome() + " ?")));
		
		
		JOptionPane.showMessageDialog(null, "O nome do animal é: " +gato.getNome()+ "\n"
				+ "Sua raça é: " + gato.getRaca());
		gato.mia();
		
		
		
	case 2:	
		cachorro.setNome ( String.valueOf(JOptionPane.showInputDialog("Qual o nome do cachorro ?")));
		cachorro.setRaca ( String.valueOf(JOptionPane.showInputDialog("Qual a raça do " +cachorro.getNome() + " ?")));
		
		JOptionPane.showMessageDialog(null, "o nome do animal é: " +cachorro.getNome()+ "\n"
				+ "Sua raça é:   " + cachorro.getRaca());
		
		cachorro.late();
	}
	
	}
}
