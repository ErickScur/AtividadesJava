package br.edu.ifcvideira.Lista11;

import javax.swing.JOptionPane;

public class Ex2Main {
	public static void main(String[] args) {
		Ex2Animal a;
		Ex2Mamifero m;
		Ex2Peixe p;
		
		String nome;
		double comp;
		int patas;
		String cor;
		String amb;
		double vel;
		String carac;
		String alimento;

		String[] options = {"Animal", "Peixe", "Mamifero", "Sair"};
		int op;
		
		
		for(;;) {
			op = JOptionPane.showOptionDialog(null, "Selecione uma op��o: ",
	                "Exercicio",
	                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
			if(op==3) {break;};
			
			nome = String.valueOf(JOptionPane.showInputDialog("Qual o nome do animal: "));
			comp = Double.parseDouble(JOptionPane.showInputDialog("Qual o comprimento de um "+nome+": "));
			patas = Integer.parseInt(JOptionPane.showInputDialog("Quantas patas um "+nome+" tem: "));
			cor = String.valueOf(JOptionPane.showInputDialog("Qual a cor de um "+nome+": "));
			amb = String.valueOf(JOptionPane.showInputDialog("Em qual ambiente um "+nome+" vive: "));
			vel = Double.parseDouble(JOptionPane.showInputDialog("Qual a velocidade de um "+nome+": "));
			
			if(op==0) {
				a = new Ex2Animal(nome, comp, patas, cor, amb, vel);
				a.imprime();
			} else if(op==1) {
				carac = String.valueOf(JOptionPane.showInputDialog("Quais as caracteristicas de um "+nome+": "));
				p = new Ex2Peixe(nome, comp, patas, cor, amb, vel, carac);
				p.imprime();
			} else if(op==2) {
				alimento = String.valueOf(JOptionPane.showInputDialog("Qual o alimento de um "+nome+": "));
				m = new Ex2Mamifero(nome, comp, patas, cor, amb, vel, alimento);
				m.imprime();
				
			}
		}
	
		
		
	}
}
