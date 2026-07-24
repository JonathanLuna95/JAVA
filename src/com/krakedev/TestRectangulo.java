package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangulo r1 = new Rectangulo();
		r1.altura = 5;
		r1.base = 4;
		
		int resultadoArea;
		resultadoArea = r1.calcularArea();
		System.out.println("Resultado: " + resultadoArea);
		
		double resultadoPerimetro1;
		resultadoPerimetro1 = r1.calcularPerimetro();
		System.out.println("Resultado perímetro rectángulo 1: " + resultadoPerimetro1);
		
		Rectangulo r2 = new Rectangulo();
		r2.altura = 8;
		r2.base =2;
		
		int resultadoArea2;
		resultadoArea2 = r2.calcularArea();
		System.out.println("Resultado rectangulo 2: " + resultadoArea2);
		
		double resultadoPerimetro2;
		resultadoPerimetro2 = r2.calcularPerimetro();
		System.out.println("Resultado perímetro rectángulo 2: " + resultadoPerimetro2);
		
		Rectangulo r3 = new Rectangulo();
		r3.altura = 2;
		r3.base =4;
		
		double resultadoPerimetro;
		resultadoPerimetro = r3.calcularPerimetro();
		System.out.println("Resultado perímetro rectángulo 3: " + resultadoPerimetro);

	}

}
