package com.krakedev;

public class TestRestaurante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Restaurante rest1;
		rest1 = new Restaurante("Trio Cocina Libre", "Av. Río Lelia", 4.8f);
		
		Restaurante rest2 = new Restaurante("Origen", "Av. La Lorena", 4.5f);
		

		System.out.println("**********Restaurante 1 ************");
		System.out.println("Nombre : " + rest1.getNombre());
		System.out.println("Direccion : " + rest1.getDireccion());
		System.out.println("Calificacion : " + rest1.getCalificacion());
		
		System.out.println("**********Restaurante 2 ************");
		System.out.println("Nombre : " + rest2.getNombre());
		System.out.println("Direccion : " + rest2.getDireccion());
		System.out.println("Calificacion : " + rest2.getCalificacion());
		

	}

}
