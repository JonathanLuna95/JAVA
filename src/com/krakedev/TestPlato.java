package com.krakedev;

public class TestPlato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Plato platoA = new Plato();
		Plato platoB = new Plato();
		Plato platoC = new Plato();
		
		System.out.println("**********Plato A con valores por defecto************");
		System.out.println("Nombre : " + platoA.getNombre());
		System.out.println("Tipo : " + platoA.getTipo());
		System.out.println("Precio : " + platoA.getPrecio());
		System.out.println("Disponible : " + platoA.getDisponible());

		System.out.println("**********Plato B con valores por defecto************");
		System.out.println("Nombre : " + platoB.getNombre());
		System.out.println("Tipo : " + platoB.getTipo());
		System.out.println("Precio : " + platoB.getPrecio());
		System.out.println("Disponible : " + platoB.getDisponible());

		System.out.println("**********Plato C con valores por defecto************");
		System.out.println("Nombre : " + platoC.getNombre());
		System.out.println("Tipo : " + platoC.getTipo());
		System.out.println("Precio : " + platoC.getPrecio());
		System.out.println("Disponible : " + platoC.getDisponible());
		
		platoA.setNombre("Ensalada Cesar");
		platoA.setTipo("Entrada");
		platoA.setPrecio(6.50f);
		platoA.setDisponible(true);

		platoB.setNombre("Lomo Fino");
		platoB.setTipo("Plato fuerte");
		platoB.setPrecio(18.75f);
		platoB.setDisponible(true);

		platoC.setNombre("Cheesecake");
		platoC.setTipo("Postre");
		platoC.setPrecio(5.25f);
		platoC.setDisponible(false);
		
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
