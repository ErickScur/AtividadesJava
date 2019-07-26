/*15 - Faça um algoritmo que leia o nome de um piloto, 
 * leia a distância percorrida em km e o tempo que o piloto levou para percorrê-la (em horas). 
 * O algoritmo deve calcular a velocidade média (velocidade = distancia / tempo) - em km/h,
 * e exibir a seguinte frase:
 * A velocidade média do <nome do piloto> foi <velocidade media calculada> km/h.
 */
package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

public class Exercicio15 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String nome;
		double distancia;
		double tempo;
		double vm;
		
		System.out.println("Digite o nome do piloto:");
		nome = String.valueOf(in.nextLine());
		
		System.out.println("Digite a distancia percorrida:");
		distancia = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite o tempo:");
		tempo = Double.parseDouble(in.nextLine());
		
		vm = distancia/tempo;
		
		System.out.println("A velocidade media de "+nome+"foi "+vm+"km/h");
	}
}
