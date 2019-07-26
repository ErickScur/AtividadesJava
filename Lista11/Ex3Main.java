package br.edu.ifcvideira.Lista11;

import javax.swing.JOptionPane;

public class Ex3Main {
	public static void main(String[] args) {
		Ex3Produto prod;
		Ex3Eletrodomestico e;
		Ex3Roupa roupa;
		Ex3Alimento a;
		
		String codigo;
		String descricao;
		double valor;
		String tipo;
		double voltagem;
		double tamanho;
		String cor;
		
		
		
		int op;
		
		String[] options = {"Produto","Eletrodomestico","Roupa","Alimento","Sair"};
		
		for(;;) {
			op = JOptionPane.showOptionDialog(null, "Selecione uma op��o: ",
	                "Exercicio",
	                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
			if(op==4) {break;}
				
				codigo = String.valueOf(JOptionPane.showInputDialog("Qual o codigo do Produto:"));
				descricao = String.valueOf(JOptionPane.showInputDialog("Qual a descri��o do Produto:"));
				valor = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do produto: "));
				
			if(op==0) {
				prod = new Ex3Produto(codigo, descricao, valor);
				prod.imprime();
				
			} else if(op==1) {
				voltagem = Double.parseDouble(JOptionPane.showInputDialog("Qual a voltagem do Eletrodomestico: "));
				e = new Ex3Eletrodomestico(codigo, descricao, valor, voltagem);
				e.imprime();
				
			} else if(op==2) {
				tamanho = Double.parseDouble(JOptionPane.showInputDialog("Qual o tamanho da pe�a: "));
				cor = String.valueOf(JOptionPane.showInputDialog("Qual a cor da pe�a: "));
				roupa = new Ex3Roupa(codigo, descricao, valor, tamanho, cor);
				roupa.imprime();
				
			} else if(op==3) {
				tipo = String.valueOf(JOptionPane.showInputDialog("Qual o tipo do alimento: "));
				a = new Ex3Alimento(codigo, descricao, valor, tipo);
				a.imprime();
				
			}
			
			
		}
		
		
		
	}
	
}
