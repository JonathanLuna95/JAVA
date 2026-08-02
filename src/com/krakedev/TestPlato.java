package com.krakedev;

public class TestPlato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Plato platoA = new Plato("Ensalada Cesar", "Entrada", 6.50f, true);
		Plato platoB = new Plato("Lomo Fino", "Plato fuerte", 18.75f, true);
		Plato platoC = new Plato("Cheesecake", "Postre", 5.25f, false);
		
		
		System.out.println("**********Plato A con valores modificados************");
		System.out.println("Nombre : " + platoA.getNombre());
		System.out.println("Tipo : " + platoA.getTipo());
		System.out.println("Precio : " + platoA.getPrecio());
		System.out.println("Disponible : " + platoA.getDisponible());

		System.out.println("**********Plato B con valores modificados************");
		System.out.println("Nombre : " + platoB.getNombre());
		System.out.println("Tipo : " + platoB.getTipo());
		System.out.println("Precio : " + platoB.getPrecio());
		System.out.println("Disponible : " + platoB.getDisponible());

		System.out.println("**********Plato C con valores modificados************");
		System.out.println("Nombre : " + platoC.getNombre());
		System.out.println("Tipo : " + platoC.getTipo());
		System.out.println("Precio : " + platoC.getPrecio());
		System.out.println("Disponible : " + platoC.getDisponible());

	}

}
