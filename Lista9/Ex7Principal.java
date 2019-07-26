package br.edu.ifcvideira.Lista9;

import javax.swing.JOptionPane;

public class Ex7Principal {
	public static void main(String[] args) {
		Ex7Computador comp = new Ex7Computador();
		int op, op1;
		String[] processadores = {"Processador de 600Mhz", "Processador de 800Mhz", "Processador de 933Mhz"};
		String[] memorias = {"Memoria 128 ram", "Memoria 256 ram", "Memoria 384 ram", "Memoria 512 ram"};
		String[] hds = {"HD 20Gb", "HD 40Gb", "HD 60Gb"};
		String[] monitores = {"Monitor de 15 pol", "Monitor de 17 pol"};
		
		for(;;) {
			op = Integer.parseInt(JOptionPane.showInputDialog("Escolha um item): \n"
					+ "1- Processadores \n"
					+ "2- Memorias RAM \n"
					+ "3- Discos rigidos \n"
					+ "4- Monitores \n"
					+ "5- finalizar \n"
					+ "Total = R$"+comp.calculaPreco()));
			if(op==5) {break;}
			if(op==1) {
				op1 = JOptionPane.showOptionDialog(null, "Processadores: ",
		                "Escolha uma opção",
		                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, processadores, processadores[0]);
				if(op1==0) {comp.setProcessador(700);}else if(op1==1) {comp.setProcessador(830);} else if (op1==2) {comp.setProcessador(910);}
				
			} else if(op==2) {
				op1 = JOptionPane.showOptionDialog(null, "Memorias RAM: ",
		                "Escolha uma opção",
		                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, memorias, memorias[0]);
				if(op1==0) {comp.setRam(350);}else if(op1==1) {comp.setRam(700);} else if (op1==2) {comp.setRam(1050);} else if(op1==3) {comp.setRam(1400);}
				
			} else if(op==3) {
				op1 = JOptionPane.showOptionDialog(null, "Discos Rigidos: ",
		                "Escolha uma opção",
		                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, hds, hds[0]);
				if(op1==0) {
					comp.setHd(300);}
				else if(op1==1) {
					comp.setHd(420);}
				else if (op1==2)
				{comp.setHd(500);}
				
			} else if(op==4) {
				op1 = JOptionPane.showOptionDialog(null, "Monitores: ",
		                "Escolha uma opção",
		                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, monitores, monitores[0]);
				if(op1==0) {comp.setMonitor(320);}else if(op1==1) {comp.setMonitor(520);}
				
			} else {
				JOptionPane.showMessageDialog(null, "Numero invalido");
				
			}
			
		}
		
		JOptionPane.showMessageDialog(null, "O total é de R$"+comp.calculaPreco());
            
	}

}
