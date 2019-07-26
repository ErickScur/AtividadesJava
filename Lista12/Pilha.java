package br.edu.ifcvideira.Lista12;

import javax.swing.JOptionPane;

public class Pilha {
	public static void main(String[] args) {
		int pilha[] = new int[50];
		int op;
		int i;
		int tam=0;
		String msg ="";
		
		for(;;) {
			op = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: \n"
					+ "1 - Empil har\n"
					+ "2 - Desempilhar\n"
					+ "3 - Consultar\n"
					+ "4 - Exibir numero no topo\n"
					+ "5 - Sair"));
			if(op==1) {//empilhar
				if(tam<50)/*verifica se está cheia*/ {
					pilha[tam] = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor:"));
					tam++;
				}else {
					JOptionPane.showMessageDialog(null, "A pilha está cheia");
				}
			}else if(op ==2) {//desempilhar
				if(tam>0) {/*verifica se está vazia*/
					pilha[tam-1] = 0;
					tam--;
				}else{
					JOptionPane.showMessageDialog(null, "A pilha está vazia");
				}
			}else if(op==3) {
				//consultar
				for(i=(tam-1);i>=0;i--) {
					msg+=pilha[i]+"\n";
				}
				JOptionPane.showMessageDialog(null,msg);
				msg="";
			}else if(op==4) {
				JOptionPane.showMessageDialog(null, (pilha[tam-1]));
			}else if(op==5) {
				break;
			}
		}
		
	}
	
}
