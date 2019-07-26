
package br.edu.ifcvideira.Lista9;

import javax.swing.JOptionPane;

public class Ex8Principal {
	public static void main(String[] args) {
		Ex8Livro l1 = new Ex8Livro();
		Ex8Livro l2 = new Ex8Livro();
		Ex8Livro l3 = new Ex8Livro();
		
			l1.setTitulo("Cinquenta tons de cinza");
			l1.setAutor("SGUAGSUA");
			l1.setAno(2022);
			
			l2.setTitulo("Harry Potter fuma a pedra filosofal");
			l2.setAutor("Faustão");
			l2.setAno(2015);
			
			l3.setTitulo("A incrivel história de vida de Jailson Mendes");
			l3.setAutor("Mendes, jailson");
			l3.setAno(2019);

			JOptionPane.showMessageDialog(null, "Titulo do livro 1: "+l1.getTitulo());
			JOptionPane.showMessageDialog(null, "Autor do livro 1: "+l1.getAutor());
			JOptionPane.showMessageDialog(null, "Ano do livro 1: "+l1.getAno());
			
			JOptionPane.showMessageDialog(null, "Titulo do livro 2: "+l2.getTitulo());
			JOptionPane.showMessageDialog(null, "Autor do livro 2: "+l2.getAutor());
			JOptionPane.showMessageDialog(null, "Ano do livro 2: "+l2.getAno());
			
			JOptionPane.showMessageDialog(null, "Titulo do livro 3: "+l3.getTitulo());
			JOptionPane.showMessageDialog(null, "Autor do livro 3: "+l3.getAutor());
			JOptionPane.showMessageDialog(null, "Ano do livro 3: "+l3.getAno());
			
		
		
	}
}
