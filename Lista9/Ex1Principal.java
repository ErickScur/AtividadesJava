package br.edu.ifcvideira.Lista9;

import javax.swing.JOptionPane;

public class Ex1Principal {
	public static void main(String[] args) {
		Ex1Contador co = new Ex1Contador();
		
		int op;
		
		for(;;) {
			op = Integer.parseInt(JOptionPane.showInputDialog("Valor atual: "+co.getNumero()+"\n"
					+ "Escolha uma opção:\n"
					+ "1- Incrementar\n"
					+ "2- Decrementar\n"
					+ "3- Sair"));
			
			if(op==1) {
				co.incrementa();
			}else if(op==2) {
				co.decrementa();
			}else if(op==3) {
				JOptionPane.showMessageDialog(null, "Finalizando");
				break;
			}else {
				JOptionPane.showMessageDialog(null, "Opção invalida");

			}
		}
	}
}
