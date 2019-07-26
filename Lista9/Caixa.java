package br.edu.ifcvideira.Lista9;

import javax.swing.JOptionPane;

public class Caixa {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		
		int op;
		double valor;
		
		for(;;) {
			op = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção:\n"
					+ "1- Consultar saldo\n"
					+ "2- Sacar\n"
					+ "3- Depositar\n"
					+ "4- Sair"));
			
			if(op==1) {
				JOptionPane.showMessageDialog(null, "Seu saldo é: R$"+cc.getSaldo());
			}else if(op==2) {
				cc.saque(Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do saque? ")));
			}else if(op==3) {
				valor = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do deposito?"));
				cc.deposito(valor);
			}else if(op==4) {
				JOptionPane.showMessageDialog(null, "Finalizando");
				break;
			}else {
				JOptionPane.showMessageDialog(null, "Opção invalida");

			}
		}
	}
}
