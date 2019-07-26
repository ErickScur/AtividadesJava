//	Escreva a classe Veiculo contendo Peso em quilos (int), VelocMax em Km/h
//(int) e Preco em R$ (float). Inclua um construtor sem argumentos e um que
//inicialize os dados com os valores recebidos como argumento. Crie os getters e
//setters da classe; Crie um m�todo para calcular o valor do ve�culo com 10% de
//desconto;
//	b) Crie uma classe CarroPasseio que herda Veiculo como base. Inclua Cor (string)
//e Modelo (string). Inclua um construtor sem argumentos que inicialize os dados
//com zeros e uma que inicialize os dados com os valores recebidos como
//argumentos. Crie os getters e setters da classe; Crie um m�todo para calcular o
//valor do Carro que sobrescreva o m�todo da classe ve�culo aplicando 15% de
//desconto;
//	c) Crie uma classe Caminhao que herda Veiculo. Inclua Toneladas (carga
//m�xima), AlturaMax (int) e Comprimento (int). Inclua um construtor sem
//argumentos que inicialize os dados com zeros e um que inicialize com os valores
//recebidos como argumento. Crie os getters e setters da classe; Crie um m�todo
//para calcular o valor do Caminh�o que sobrescreva o m�todo da classe ve�culo
//aplicando 20% de desconto;

package br.edu.ifcvideira.Lista11;

import javax.swing.JOptionPane;

public class Ex1Main {
	public static void main(String[] args) {
		Ex1Veiculo ve;
		double preco, comprimento;
		String cor, modelo;
		int peso, velMax, ton, altMax, op;
		
		String[] options = {"Veiculo","Carro de passeio","Caminhao","Sair"};
		
		for(;;) {
			op = JOptionPane.showOptionDialog(null, "Selecione uma op��o: ",
	                "Exercicio",
	                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
			if(op==3) {break;}
			
			peso = Integer.parseInt(JOptionPane.showInputDialog("Qual o peso do veiculo: "));
			velMax = Integer.parseInt(JOptionPane.showInputDialog("Qual a velocidade maxima: "));
			preco = Double.parseDouble(JOptionPane.showInputDialog("Qual o pre�o do veiculo: "));
			
			if(op==0) {
				ve = new Ex1Veiculo(peso, velMax, preco);
				ve.imprime();
				
			} else if(op==1) {
				cor = String.valueOf(JOptionPane.showInputDialog("Qual a cor do veiculo: "));
				modelo = String.valueOf(JOptionPane.showInputDialog("Qual o modelo do veiculo: "));
				
				ve = new Ex1CarroPasseio(peso, velMax, preco, cor, modelo);				ve.imprime();
				
			} else {
				ton = Integer.parseInt(JOptionPane.showInputDialog("Qual a capacidade em toneladas: "));
				altMax = Integer.parseInt(JOptionPane.showInputDialog("Qual a altura maxima: "));
				comprimento = Double.parseDouble(JOptionPane.showInputDialog("Qual o comprimento do veiculo: "));
				
				ve = new Ex1Caminhao(peso, velMax, preco, ton, altMax, comprimento);
				ve.imprime();
				
			}
			
		}
		
		
		
		
	}
}
