//- Crie uma classe chamada Ingresso que possui um valor em reais.
//	a. crie uma classe Normal, que herda Ingresso e possui um m�todo que imprime:
//"Ingresso Normal" e o seu valor. 
//	b. Crie uma classe VIP, que herda Ingresso e possui um valor adicional. Crie um
//m�todo que retorne o valor do ingresso VIP e o tipo do ingresso (com o adicional
//inclu�do).
//	c. crie uma classe CamaroteInferior (que possui a localiza��o do ingresso e
//m�todos para cadastrar e imprimir esta localiza��o, al�m de ser mais cara que a
//VIP) e uma classe CamaroteSuperior, que � mais cara (possui valor adicional �s
//demais). Ambas as classes herdam a classe VIP.
//
//Obs: Todas permitem a impress�o dos valores e dos tipos dos ingressos.

package br.edu.ifcvideira.Lista10;

import javax.swing.JOptionPane;

public class Ex5Main {
	public static void main(String[] args) {
		Ex4Ingresso in = new Ex4Ingresso();
		Ex4Vip vi = new Ex4Vip();
		Ex4CamInferior ci = new Ex4CamInferior();
		Ex4CamSuperior cs = new Ex4CamSuperior();
	
		int op;
	
		for(;;) {
			op = Integer.parseInt(JOptionPane.showInputDialog("Escolha o tipo do seu ingresso: \n"
					+ "1 - Normal \n"
					+ "2 - Vip \n"
					+ "3 - Camarote Inferior \n"
					+ "4 - Camarote Superior \n"
					+ "5 - Sair"));
			 if(op==5) {break;}
			 if(op==1) {
				 in.setTipo("Normal");
				 in.setValor(100);
				 in.imprime();
				 
			 } else if(op==2) {
				 vi.setTipo("VIP");
				 vi.setValor(100);
				 vi.imprime();
				 
			 } else if(op==3) {
				 ci.setLocalizacao(String.valueOf(JOptionPane.showInputDialog("Qual a localiza��o desejada: ")));
				 ci.setValor(100);
				 ci.setTipo("Camarote Inferior");
				 
				 ci.imprime();
			 } else if(op==4) {
				 cs.setTipo("Camarote Superior");
				 cs.setValor(100);
				 
				 cs.imprime();
			 } else {
				 JOptionPane.showMessageDialog(null, "numero invalido");
			 }
			
			
		
		}

	}
}
