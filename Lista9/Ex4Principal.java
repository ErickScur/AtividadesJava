package br.edu.ifcvideira.Lista9;

import javax.swing.JOptionPane;

public class Ex4Principal {
	public static void main(String[] args) {
		Ex4Pessoa pe1 = new Ex4Pessoa();
		Ex4Pessoa pe2 = new Ex4Pessoa();
		Ex4Pessoa pe3 = new Ex4Pessoa();
		
		int op;
		
		pe1.setNome(String.valueOf(JOptionPane.showInputDialog("Qual o nome da pessoa 1:")));
		pe1.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Qual a idade da(a) "+pe1.getNome())));
		
		pe2.setNome(String.valueOf(JOptionPane.showInputDialog("Qual o nome da pessoa 2:")));
		pe2.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Qual a idade da(a) "+pe2.getNome())));
		
		pe3.setNome(String.valueOf(JOptionPane.showInputDialog("Qual o nome da pessoa 3:")));
		pe3.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Qual a idade da(a) "+pe3.getNome())));
		
		for(;;) {
			op = Integer.parseInt(JOptionPane.showInputDialog("Escolha quem fez aniversario: \n"
					+ "1 - "+pe1.getNome()+"\n"
							+ "2 - "+pe2.getNome()+"\n"
									+ "3 - "+pe3.getNome()+"\n"
											+ "4 - finalizar"));
			
			if(op == 1) {
				pe1.fazAniversario();
			} else if(op == 2) {
				pe2.fazAniversario();
			} else if(op == 3) {
				pe3.fazAniversario();
			} else if(op==4) {
				break;
			} else {
				JOptionPane.showMessageDialog(null, "Op��o Invalida");
			}
		}
		
		JOptionPane.showMessageDialog(null, pe1.getNome()+" - "+pe1.getIdade()+" anos. \n"
				+ pe2.getNome()+" - "+pe2.getIdade()+" anos. \n"
						+ pe3.getNome()+" - "+pe3.getIdade()+" anos.");
		
		
		
		
		
		
	}
}
