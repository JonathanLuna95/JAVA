package com.krakedev;

public class VehiculoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// para creacion de varibale dos pilares: tipos de datos - nombre a la variable

		int edad;
		String nombre;

		// Primera variable vehiculo

		Vehiculo v1;

		// pilar para crear instancia palabra new tipo de dato
		v1 = new Vehiculo("Mazda", "CX30", "2026", "50000");

		// vehiculo

		Vehiculo v2 = new Vehiculo("Toyota", "Yaris", "2026", "60000");

		// Imprimir

		System.out.println("Hola Mundo");
		System.out.println("Vehiculo 1 con valores por defecto");
		System.out.println("Marca : " + v1.getMarca());
		System.out.println("Modelo : " + v1.getModelo());
		System.out.println("Anio : " + v1.getAnio());
		System.out.println("Precio :" + v1.getPrecio());


		System.out.println("Vehiculo 1 despues de asignar/setear");

		System.out.println("Marca : " + v1.getMarca());
		System.out.println("Modelo : " + v1.getModelo());
		System.out.println("Anio : " + v1.getAnio());
		System.out.println("Precio :" + v1.getPrecio());


		System.out.println("Vehiculo 1 despues de asignar/setear");

		System.out.println("Marca : " + v2.getMarca());
		System.out.println("Modelo : " + v2.getModelo());
		System.out.println("Anio : " + v2.getAnio());
		System.out.println("Precio :" + v2.getPrecio());

		System.out.println("Vehiculo 3 despues de asignar/setear");

		Vehiculo v3 = new Vehiculo("BMW", "X3", "2025", "65000");

		System.out.println("Marca : " + v3.getMarca());
		System.out.println("Modelo : " + v3.getModelo());
		System.out.println("Anio : " + v3.getAnio());
		System.out.println("Precio :" + v3.getPrecio());
		
		System.out.println("Vehiculo 4 despues de asignar/setear");

		Vehiculo v4 = new Vehiculo("KIA", "RIO", "2019", "15000");

		System.out.println("Marca : " + v4.getMarca());
		System.out.println("Modelo : " + v4.getModelo());
		System.out.println("Anio : " + v4.getAnio());
		System.out.println("Precio :" + v4.getPrecio());
		

	}

}
