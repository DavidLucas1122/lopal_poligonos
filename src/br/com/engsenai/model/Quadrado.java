package br.com.engsenai.model;
 
 public class Quadrado {
 
	 public double lado;
	 
	 public double calcularArea() {
		double area = Math.pow(lado, 2)
		return area
	 }
	 
	 public double calcularPerimetro() {
		 double perimetro = 4 * lado;
		 return perimetro
	 }
 }