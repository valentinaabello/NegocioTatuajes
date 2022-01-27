package tatuajes;

public class Principal {

	public static void main(String[] args) {
	
		Cliente cliente1 = new Cliente( "Pedro ", 15895624 , 35);
		Cliente cliente2 = new Cliente( "Pepe ", 158945241 , 55);	
		
		Tatuador tatuador1 = new Tatuador( "Luis ", 188956241);
		Tatuador tatuador2 = new Tatuador( "Juan ", 228935241);

		Insumo insumo1 = new Insumo( "Roja", 2, 1, 500, cliente1);
		Insumo insumo2 = new Insumo( "verde/Naranja", 6, 1, 1000, cliente2);
						
		Local local1 = new Local("Esquina 34", "Santiago", "RM", 569836493, tatuador1, 300000);
		Local local2 = new Local("Avenida 68", "San Joaquin", "RM", 567829038, tatuador2, 310000);
		
		Venta venta1 = new Venta(5, 15000, 3000, 12000, 1, local1, cliente1);
		Venta venta2 = new Venta(20, 50000, 10000, 40000, 3, local2, cliente2);
		
		Inventario inventario1 = new Inventario("Negra", 200, 2, 150, local1);
		Inventario inventario2 = new Inventario("Roja", 300, 2,100, local2);
		
		System.out.println("-------------------------");
		System.out.println("Ventas Local 1: ubicado en "+local1.getDireccion()+", "+local1.getComuna()+".");
		System.out.println("Atentido por el Tatuador: "+tatuador1.getNombre());
		System.out.println("Atendió al cliente: "+cliente1.getNombre() +", con RUT: "+ cliente1.getRut() +".");
		System.out.println("Con la siguiente cantidad de insumos: ");
		System.out.println("		1. Color de tinta: "+ insumo1.getTinta() );
		System.out.println("		2. Aguja: "+ insumo1.getAguja());
		System.out.println("		3. Alcohol: "+insumo1.getAlcohol() +"cc");
		System.out.println("		4. Guantes: "+ insumo1.getGuantes());
		System.out.println("Con un valor de: " + venta1.getPrecio());
		System.out.println("Obteniendo una ganancia de: " + venta1.getGanancia());
		
		System.out.println("-------------------------");
		System.out.println("Ventas Local 2: ubicado en "+local2.getDireccion()+", "+local2.getComuna()+".");
		System.out.println("Atentido por el Tatuador: "+tatuador2.getNombre());
		System.out.println("Atendió al cliente: "+cliente2.getNombre() +", con RUT: "+ cliente2.getRut() +".");
		System.out.println("Con la siguiente cantidad de insumos: ");
		System.out.println("		1. Color de tinta: "+ insumo2.getTinta() );
		System.out.println("		2. Aguja: "+ insumo2.getAguja());
		System.out.println("		3. Alcohol: "+insumo2.getAlcohol() +"cc");
		System.out.println("		4. Guantes: "+ insumo2.getGuantes());
		System.out.println("Con un valor de: " + venta2.getPrecio());
		System.out.println("Obteniendo una ganancia de: " + venta2.getGanancia());
		System.out.println("-------------------------");
		System.out.println("-------------------------");
		System.out.println("Stock disponible en Local 1: ");
		System.out.println("1. Color tinta: "+inventario1.getTinta());
		System.out.println("2. Guantes: "+inventario1.getGuantes());
		System.out.println("3. Alcohol: "+inventario1.getAlcohol());
		System.out.println("4. Aguja: "+inventario1.getAguja());
		System.out.println("-------------------------");
		System.out.println("Stock disponible en Local 2: ");
		System.out.println("1. Color tinta: "+inventario2.getTinta());
		System.out.println("2. Guantes: "+inventario2.getGuantes());
		System.out.println("3. Alcohol: "+inventario2.getAlcohol());
		System.out.println("4. Aguja: "+inventario2.getAguja());
		
		

	}

}
