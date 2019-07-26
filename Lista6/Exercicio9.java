package br.edu.ifcvideira.Lista6;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		int canal;
		int pessoas;
		int c4=0;
		int c5=0;
		int c7=0;
		int c12=0;
		
		for(;;) {
			System.out.println("Qual canal está assistindo:\n"
					+ "4- Canal 4\n"
					+ "5- Canal 5\n"
					+ "7- Canal 7\n"
					+ "12- Canal 12\n"
					+ "0- Finalizar a pesquisa");
			canal = Integer.parseInt(in.nextLine());
		
			if(canal==0) {
				break;
			}
			System.out.println("Quantas pessoas estão assisitndo o canal?");
			pessoas = Integer.parseInt(in.nextLine());
			
			if(canal==4) {
				c4+=pessoas;
			}else if(canal==5) {
				c5+=pessoas;
			}else if(canal==7) {
				c7+=pessoas;
			}else if(canal==12) {
				c12+=pessoas;
			}else {
				System.out.println("O canal foi informado incorretamente");
			}
		}
		System.out.println("A porcentagem do canal 4 é: "+df.format((double)c4/(c4+c5+c7+c12)*100));
		System.out.println("A porcentagem do canal 5 é: "+df.format((double)c5/(c4+c5+c7+c12)*100));
		System.out.println("A porcentagem do canal 7 é: "+df.format((double)c7/(c4+c5+c7+c12)*100));
		System.out.println("A porcentagem do canal 12 é: "+df.format((double)c12/(c4+c5+c7+c12)*100));

		
	}
}
