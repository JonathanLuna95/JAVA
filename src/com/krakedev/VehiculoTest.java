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
		System.out.println("Marca : " + v1.marca);
		System.out.println("Modelo : " + v1.modelo);
		System.out.println("Anio : " + v1.anio);
		System.out.println("Precio :" + v1.precio);
		
		//Impresion del objeto completo 
		System.out.println("Objeto completo vehiculo 1 : " + v1);
		
		v1.marca="Mazda";
		v1.modelo="cx30";
		v1.anio="2026";
		v1.precio="50";
		
		System.out.println("Vehiculo 1 despues de asignar/setear");
		
		System.out.println("Marca : " + v1.marca);
		System.out.println("Modelo : " + v1.modelo);
		System.out.println("Anio : " + v1.anio);
		System.out.println("Precio :" + v1.precio);
		

	}

}
