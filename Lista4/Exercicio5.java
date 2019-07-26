package br.edu.ifcvideira.Lista4;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double joao = 1.50;
		double ze = 1.10;
		double anos = 0;
		
		while(joao > ze) {
			joao += 0.02;
			ze += 0.03;
			anos++;
		}
		
		System.out.println("Seriam necessários " + anos + " anos para que Zé seja maior que João");
		
		
		
		
	}

	}

