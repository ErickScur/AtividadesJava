//Crie a classe Imovel, que possui um endere�o e um pre�o.
//a. Crie uma classe Novo, que herda Imovel e possui um adicional no pre�o. Crie
//m�todos de acesso e impress�o deste valor adicional e um m�todo polim�rfico
//para c�lculo do pre�o;
//b. Crie uma classe Velho, que herda Imovel e possui um desconto no pre�o. Crie
//m�todos de acesso e impress�o para este desconto e um m�todo polim�rfico para
//c�lculo do pre�o;

package br.edu.ifcvideira.Lista10;

import javax.swing.JOptionPane;

public class Ex6Main{
	public static void main(String[] args) {
		Ex6Imovel im;
		String end;
		double vl;
		int op;
		
		for(;;) {
			op = Integer.parseInt(JOptionPane.showInputDialog("Qual tipo de imovel deseja cadastrar: \n"
					+ "1 - Novo \n"
					+ "2 - Velho \n"
					+ "3 - Sir"));
			
			if(op==3) {break;}
			end = String.valueOf(JOptionPane.showInputDialog(null, "Qual o endere�o do imovel: "));
			vl = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do imovel: "));
			
			if(op == 1) {
				im = new Ex6Novo(end, vl);
				im.imprime();
				
			} else if(op==2) {
				im = new Ex6Velho(end, vl);
				im.imprime();
				
			}
		}
	}

}
