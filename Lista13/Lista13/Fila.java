package br.edu.ifcvideira.Lista13;

import javax.swing.JOptionPane;

public class Fila {
	public static void main(String[] args) {
		int fila[] = new int[50];
		int filaP[] = new int [50];
		int op;
		int i;
		int tn=0;
		int tp=0;
		int sn=1;
		int sp=1;
		String msg="Sequencia de atendimento:\n";
		
		for(;;) {
			op=Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: \n"
					+ "1- Inserir\n"
					+ "2- Atender\n"
					+ "3- Senha prioritária\n"
					+ "4- Verificar fila\n"
					+ "5- Sair"));
			
			if(op==5) {
				break;
			}else if(op==1) {
				if(tn<50) {
					fila[tn] = sn;
					tn++;
					sn++;
					
				}
			}else if(op==2) {
				if(tp>0) {
					for(i=0;i<tp;i++) {
						 filaP[i]= filaP[i+1];
					}
					tp--;
				}else if(tn>0) {
					for(i=0;i<tn;i++) {
						 fila[i]= fila[i+1];
					}
					tn--;
				}
			}else if(op==3) {
				if(tp<50) {
					filaP[tp] = sp;
					tp++;
					sp++;
				}
			}else if(op==4) {
				//fila p
				for(i=0; i<tp; i++) {
					msg+="P"+filaP[i]+"   ";
				}
				for(i=0; i<tn; i++) {
					msg+="N"+fila[i]+"   ";
				}
				JOptionPane.showMessageDialog(null, msg);
				msg="Sequencia de atendimento:\n";

			}
			
		}
	}
}
