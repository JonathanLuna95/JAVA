package com.krakedev;

public class TestPlato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Plato platoA = new Plato();
		Plato platoB = new Plato();
		Plato platoC = new Plato();
		
		System.out.println("**********Plato A con valores por defecto************");
		System.out.println("Nombre : " + platoA.nombre);
		System.out.println("Tipo : " + platoA.tipo);
		System.out.println("Precio : " + platoA.precio);
		System.out.println("Disponible : " + platoA.disponible);

		System.out.println("**********Plato B con valores por defecto************");
		System.out.println("Nombre : " + platoB.nombre);
		System.out.println("Tipo : " + platoB.tipo);
		System.out.println("Precio : " + platoB.precio);
		System.out.println("Disponible : " + platoB.disponible);

		System.out.println("**********Plato C con valores por defecto************");
		System.out.println("Nombre : " + platoC.nombre);
		System.out.println("Tipo : " + platoC.tipo);
		System.out.println("Precio : " + platoC.precio);
		System.out.println("Disponible : " + platoC.disponible);
		
		platoA.nombre = "Ensalada Cesar";
		platoA.tipo = "Entrada";
		platoA.precio = 6.50f;
		platoA.disponible = true;

		platoB.nombre = "Lomo Fino";
		platoB.tipo = "Plato fuerte";
		platoB.precio = 18.75f;
		platoB.disponible = true;

		platoC.nombre = "Cheesecake";
		platoC.tipo = "Postre";
		platoC.precio = 5.25f;
		platoC.disponible = false;
		
		System.out.println("**********Plato A con valores modificados************");
		System.out.println("Nombre : " + platoA.nombre);
		System.out.println("Tipo : " + platoA.tipo);
		System.out.println("Precio : " + platoA.precio);
		System.out.println("Disponible : " + platoA.disponible);

		System.out.println("**********Plato B con valores modificados************");
		System.out.println("Nombre : " + platoB.nombre);
		System.out.println("Tipo : " + platoB.tipo);
		System.out.println("Precio : " + platoB.precio);
		System.out.println("Disponible : " + platoB.disponible);

		System.out.println("**********Plato C con valores modificados************");
		System.out.println("Nombre : " + platoC.nombre);
		System.out.println("Tipo : " + platoC.tipo);
		System.out.println("Precio : " + platoC.precio);
		System.out.println("Disponible : " + platoC.disponible);

	}

}
