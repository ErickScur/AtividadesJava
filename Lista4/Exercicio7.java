package br.edu.ifcvideira.Lista4;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double voto;
		double c1 = 0;
		double c2 = 0;
		double c3 = 0;
		double c4 = 0;
		double nulo = 0;
		double branco = 0;
		
		while(2>1) {
			System.out.println("Digite seu voto, para parar de votar digite 0");
			voto = Double.parseDouble(in.nextLine());
			
			if (voto == 0) {
				break;
			} else if (voto == 1) {
				c1++;
			} else if (voto == 2) {
				c2++;
			} else if (voto == 3) {
				c3++;
			} else if (voto == 4) {
				c4++;
			} else if (voto == 5) {
				nulo++;
			} else if (voto == 6) {
				branco++;
		}
			
	}
		System.out.println("O candidato 1 teve " + c1 + " votos");
		System.out.println("O candidato 2 teve " + c2 + " votos");
		System.out.println("O candidato 3 teve " + c3 + " votos");
		System.out.println("O candidato 4 teve " + c4 + " votos");
		System.out.println("Pessoas que votaram nulo " + nulo);
		System.out.println("Pessoas que votaram em branco " + branco);

	}
}
