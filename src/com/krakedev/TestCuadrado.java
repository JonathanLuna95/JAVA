package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cuadrado c1 = new Cuadrado();
		c1.lado = 4;
		
		double resultadoArea1;
		resultadoArea1 = c1.calcularArea();
		System.out.println("Resultado área cuadrado 1: " + resultadoArea1);
		
		double resultadoPerimetro1;
		resultadoPerimetro1 = c1.calcularPerimetro();
		System.out.println("Perímetro cuadrado 1: " + resultadoPerimetro1);
		
		Cuadrado c2 = new Cuadrado();
		c2.lado = 6;

		double resultadoArea2;
		resultadoArea2 = c2.calcularArea();
		System.out.println("Resultado área cuadrado 2: " + resultadoArea2);

		double resultadoPerimetro2;
		resultadoPerimetro2 = c2.calcularPerimetro();
		System.out.println("Perímetro cuadrado 2: " + resultadoPerimetro2);
		
		Cuadrado c3 = new Cuadrado();
		c3.lado = 8;

		double resultadoArea3;
		resultadoArea3 = c3.calcularArea();
		System.out.println("Resultado área cuadrado 3: " + resultadoArea3);

		double resultadoPerimetro3;
		resultadoPerimetro3 = c3.calcularPerimetro();
		System.out.println("Perímetro cuadrado 3: " + resultadoPerimetro3);

		
		

	}

}
