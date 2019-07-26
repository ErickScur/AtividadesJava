package br.edu.ifcvideira.Lista8;

import java.util.Random;

public class Exercicio7 {
	public static void main(String[] args) {
		Random r = new Random();
		
		String respostas[][] = new String[10][10];
		String gabarito[] = new String[10];
		int resultado[] = new int[10];
		int i;
		int j;
		int x;
		
		//preencimento da matriz e do gabarito
		for(i=0; i<10; i++) {
			for(j=0; j<10; j++) {
				x = r.nextInt(4);
				if(x==0) {
					respostas[i][j] = "A";
				}else if(x==1) {
					respostas[i][j] = "B";
				}else if(x==2) {
					respostas[i][j] = "C";
				}else if(x==3) {
					respostas[i][j] = "D";
				}
			}x = r.nextInt(4);
			if(x==0) {
				gabarito[i] = "A";
			}else if(x==1) {
				gabarito[i] = "B";
			}else if(x==2) {
				gabarito[i] = "C";
			}else if(x==3) {
				gabarito[i] = "D";
			}
		}
		//impressão e verificação do resultado
		for(i=0; i<10; i++) {
			System.out.print("Aluno "+(i+1)+" - ");
			for(j=0; j<10; j++) {
				System.out.print(respostas[i][j]+"   ");
				
				if(respostas[i][j].equals(gabarito[j])){
					resultado[i]++;
				}
			}
			System.out.println(" - "+resultado[i]+" acertos");
		}
		
		//impressão do gabarito
		System.out.print("Gabarito - ");
		for(i=0; i<10; i++) {
			System.out.print(gabarito[i]+"   ");
		}
	}

}
