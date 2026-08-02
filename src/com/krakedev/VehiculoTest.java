package com.krakedev;

public class VehiculoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//para creacion de varibale dos pilares: tipos de datos - nombre a la variable
		
		int edad;
		String nombre;
		
		//Primera variable vehiculo
		
		Vehiculo v1;
		
		// pilar para crear instancia palabra new tipo de dato
		v1 = new Vehiculo();
		
		//vehiculo
		
		Vehiculo v2 = new Vehiculo();
		
		//Imprimir
		
		System.out.println("Hola Mundo");
		System.out.println("Vehiculo 1 con valores por defecto");
		System.out.println("Marca : " + v1.getMarca());
		System.out.println("Modelo : " + v1.getModelo());
		System.out.println("Anio : " + v1.getAnio());
		System.out.println("Precio :" + v1.getPrecio());
		
		//Impresion del objeto completo 
		System.out.println("Objeto completo vehiculo 1 : " + v1);
		
		v1.setMarca("Mazda");
		v1.setModelo("Cx30");
		v1.setAnio("2026");
		v1.setPrecio("50");
		
		System.out.println("Vehiculo 1 despues de asignar/setear");
		
		System.out.println("Marca : " + v1.getMarca());
		System.out.println("Modelo : " + v1.getModelo());
		System.out.println("Anio : " + v1.getAnio());
		System.out.println("Precio :" + v1.getPrecio());
		

	}

}
