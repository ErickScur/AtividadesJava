package br.edu.ifcvideira.Lista9;

public class Ex7Computador {
	private int processador;
	private int ram;
	private int hd;
	private int monitor;
	
	public int getProcessador() {
		return processador;
	}
	public void setProcessador(int processador) {
		this.processador = processador;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getHd() {
		return hd;
	}
	public void setHd(int hd) {
		this.hd = hd;
	}
	public int getMonitor() {
		return monitor;
	}
	public void setMonitor(int monitor) {
		this.monitor = monitor;
	}
	
	public int calculaPreco() {
		return 800+this.getRam()+this.getHd()+this.getMonitor()+this.getProcessador();
	}
	
}
