package br.edu.ifcvideira.Lista14;

import java.util.ArrayList;

import javax.print.attribute.standard.JobKOctets;
import javax.swing.JOptionPane;

public class ExercicioArrayList {
	 public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<>();
		int op;
		int valor;
		int pos;
		//Primeira melhoria - Menu clickavel
		//Segunda melhoria - Confirmar para apagar lista
		//Terceira melhoria - Op��o para voltar
		for(;;) {
			String[] options = {"Inserir", "Remover","Consultar","Sair"};
			op = JOptionPane.showOptionDialog(null, "Selecione uma op��o: ","Orgulho do professor",
		               JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
			if(op==0) {
				//inserir
				String[] inserir = {"No final", "Por posi��o","Voltar"};

				op = JOptionPane.showOptionDialog(null, "Como deseja inserir? ","Inserir",
			               JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, inserir, options[0]);
				if(op==0) {
					valor=Integer.parseInt(JOptionPane.showInputDialog("Digite o valor a ser inserido"));
					lista.add(valor);
				}else if(op==1) {
					pos=Integer.parseInt(JOptionPane.showInputDialog("Informe a posi��o:"));
					valor=Integer.parseInt(JOptionPane.showInputDialog("Digite o valor a ser inserido"));
					lista.add((pos-1), valor);
				}else if(op==2) {
					JOptionPane.showMessageDialog(null, "Voltando para o menu");

				}
			}else if(op==1) {
				//remover
				String[] remover = {"Por valor", "Por posi��o", "Limpar Lista","Voltar"};

				op = JOptionPane.showOptionDialog(null, "Como deseja excluir ","Remover",
			               JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, remover, options[0]);
				if(op==0) {
					//remover por valor
					valor=Integer.parseInt(JOptionPane.showInputDialog("Qual valor deseja remover:"));
					lista.remove(lista.indexOf(valor));
				}else if(op==1) {
					//remover em posi��o especifica
					pos=Integer.parseInt(JOptionPane.showInputDialog("Informe a posi��o:"));
					lista.remove(pos-1);
				}else if(op==2) {
					//limpar lista
					String[] confirmar = {"Sim", "N�o"};

					op = JOptionPane.showOptionDialog(null, "Tem certeza que deseja excluir a lista: ","Confirmar",
				               JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, confirmar, options[0]);
					if(op==0) {
						JOptionPane.showMessageDialog(null, "Limpando lista.....");
						lista.clear();
					}else if(op==1) {
						JOptionPane.showMessageDialog(null, "Voltando para o menu");
					}
				}else if(op==3) {
					JOptionPane.showMessageDialog(null, "Voltando para o menu");
				}
			}else if(op==2) {
				//consultar
				String[] consultar = {"Por valor", "Por posi��o", "Listar tudo","Voltar"};

				op = JOptionPane.showOptionDialog(null, "Como deseja consultar? ","Consultar",
			               JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, consultar, options[0]);
				if(op==1) {
					//consultar por posi��o
					pos=Integer.parseInt(JOptionPane.showInputDialog("Informe a posi��o:"));
					JOptionPane.showMessageDialog(null, lista.get(pos-1));
				}else if(op==0) {
					//consultar por valor
					valor=Integer.parseInt(JOptionPane.showInputDialog("Digite o valor a ser consultado"));
					JOptionPane.showMessageDialog(null, "O valor "+valor+" foi encontrado na posi��o "+(lista.indexOf(valor)+1));
					
				}else if(op==2) {
					//listar todo
					if(lista.isEmpty()==false) {
						JOptionPane.showMessageDialog(null, lista);
					}else {
						JOptionPane.showMessageDialog(null, "A lista est� vazia");
					}
				}else if(op==3) {
					JOptionPane.showMessageDialog(null, "Voltando para o menu");

				}
			}else if(op==3) {
				
				String[] confirmar = {"Sim", "N�o"};

				op = JOptionPane.showOptionDialog(null, "Tem certeza que deseja sair: ","Confirmar",
			               JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, confirmar, options[0]);
				if(op==0) {
					JOptionPane.showMessageDialog(null, "Saindo...........");
					break;
				}else if(op==1) {
					JOptionPane.showMessageDialog(null, "Voltando para o menu");
				}
			}else {
				JOptionPane.showMessageDialog(null, "Comando nao encontrado");
			}
			
		}
	}
}
