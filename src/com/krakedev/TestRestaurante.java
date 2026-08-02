package com.krakedev;

public class TestRestaurante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Restaurante rest1;
		rest1 = new Restaurante();
		
		Restaurante rest2 = new Restaurante();
		
		System.out.println("**********Restaurante 1 con valores por defecto************");
		System.out.println("Nombre : " + rest1.getNombre());
		System.out.println("Direccion : " + rest1.getDireccion());
		System.out.println("Calificacion : " + rest1.getCalificacion());
		
		System.out.println("**********Restaurante 2 con valores por defecto************");
		System.out.println("Nombre : " + rest2.getNombre());
		System.out.println("Direccion : " + rest2.getDireccion());
		System.out.println("Calificacion : " + rest2.getCalificacion());
		
		rest1.setNombre("Trio Cocina Libre");
		rest1.setDireccion("Av. Río Lelia");
		rest1.setCalificacion(4.8f);

		rest2.setNombre("Origen"); 
		rest2.setDireccion("Av. La Lorena");
		rest2.setCalificacion(4.5f);

		System.out.println("**********Restaurante 1 con valores por defecto************");
		System.out.println("Nombre : " + rest1.getNombre());
		System.out.println("Direccion : " + rest1.getDireccion());
		System.out.println("Calificacion : " + rest1.getCalificacion());
		
		System.out.println("**********Restaurante 2 con valores por defecto************");
		System.out.println("Nombre : " + rest2.getNombre());
		System.out.println("Direccion : " + rest2.getDireccion());
		System.out.println("Calificacion : " + rest2.getCalificacion());
		

	}

}
