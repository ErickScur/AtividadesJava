//Defina uma classe Professor com os dados: nome do professor, nome do
//departamento, n�mero de registro e data de admiss�o (Definida por uma classe
//Data com os dados: dia, m�s e ano). Crie uma classe main que permita incluir
//v�rios professores.

package br.edu.ifcvideira.Lista9;

import javax.swing.JOptionPane;

import java.util.*;

public class Ex6Principal {
	public static void main(String[] args) {
		int op;
		
		List<Ex6Prof> pro = new ArrayList<Ex6Prof>();
		
		String[] options = {"Adicionar novo professor", "Finalizar"};
		
		for(;;) {
			op = JOptionPane.showOptionDialog(null, "O que deseja fazer: ",
	                "Escolha uma op��o",
	                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
			if(op==1) {break;}
			if(op==0) {
				Ex6Prof prof = new Ex6Prof();
				pro.add(prof);
				
				prof.setNome(String.valueOf(JOptionPane.showInputDialog(null, "Qual o nome deste professor?")));
				prof.setDepart(String.valueOf(JOptionPane.showInputDialog(null, "Para qual departamento "+prof.getNome()+" trabalha")));
				prof.setNumReg(Integer.parseInt(JOptionPane.showInputDialog("Qual o numero de registro")));
				prof.setDiaAd(Integer.parseInt(JOptionPane.showInputDialog("Em que dia foi Admitido?")));
				prof.setMesAd(Integer.parseInt(JOptionPane.showInputDialog("Em que mes foi Admitido?")));
				prof.setAnoAd(Integer.parseInt(JOptionPane.showInputDialog("Em que ano foi Admitido?")));
			}
			
		}
		
		for(int i=0; i<pro.size(); i++) {
			JOptionPane.showMessageDialog(null, "Professor "+pro.get(i).getNome()+": \n"
					+ "Trabalha no departamento "+pro.get(i).getDepart()+" \n"
					+ "Numero de registro "+pro.get(i).getNumReg()+"\n"
					+ "Foi adimitido no dia: "+pro.get(i).getDiaAd()+"/"+pro.get(i).getMesAd()+"/"+pro.get(i).getAnoAd());
		}
		
		
	}
}
