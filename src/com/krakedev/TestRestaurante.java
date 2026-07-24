package com.krakedev;

public class TestRestaurante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Restaurante rest1;
		rest1 = new Restaurante();
		
		Restaurante rest2 = new Restaurante();
		
		System.out.println("**********Restaurante 1 con valores por defecto************");
		System.out.println("Nombre : " + rest1.nombre);
		System.out.println("Direccion : " + rest1.direccion);
		System.out.println("Calificacion : " + rest1.calificacion);
		
		System.out.println("**********Restaurante 2 con valores por defecto************");
		System.out.println("Nombre : " + rest2.nombre);
		System.out.println("Direccion : " + rest2.direccion);
		System.out.println("Calificacion : " + rest2.calificacion);
		
		rest1.nombre = "Trio Cocina Libre";
		rest1.direccion = "Av. Río Lelia";
		rest1.calificacion = 4.8f;

		rest2.nombre = "Origen";
		rest2.direccion = "Av. La Lorena";
		rest2.calificacion = 4.5f;

		System.out.println("**********Restaurante 1 con valores modificados************");
		System.out.println("Nombre : " + rest1.nombre);
		System.out.println("Direccion : " + rest1.direccion);
		System.out.println("Calificacion : " + rest1.calificacion);

		System.out.println("**********Restaurante 2 con valores modificados************");
		System.out.println("Nombre : " + rest2.nombre);
		System.out.println("Direccion : " + rest2.direccion);
		System.out.println("Calificacion : " + rest2.calificacion);
		

	}

}
