package br.com.engsenai.projeto_calculoDeFormas.model;

public class Quadrado {

	private double lado;
	
	public void setLado(double lado) {
		this.lado = lado;
	}
	
	private double calcularArea() {
		return lado * lado;
	}
}
