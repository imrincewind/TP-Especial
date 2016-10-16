package sitema;

public class MainMusica {

	public static void main(String[] args) {
		
		Pista p1 = new Pista("El Tiempo No Para", 311, "Bersuit Vergabarat", "De la cabeza", 2002, "Rock nacional");
		Pista p2 = new Pista("Mi caramelo", 290, "Bersuit Vergabarat", "De la cabeza", 2002, "Rock nacional");
		Pista p3 = new Pista("Party Rock Anthem", 408, "LMFAO", "Sorry for Party Rocking", 2011, "Electro pop");
		Pista p4 = new Pista("Sorry for Party Rocking", 421, "LMFAO", "Sorry for Party Rocking", 2011, "Electro pop");
		Pista p5 = new Pista("Fix you", 255, "Coldplay", "X&Y", 2005, "Rock alternativo");
		Pista p6 = new Pista("Speed of Sound", 455, "Coldplay", "X&Y", 2005, "Rock alternativo");
		Pista p7 = new Pista("Viva la vida", 320, "Coldplay", "Viva la vida", 2008, "Rock alternativo");
		Pista p8 = new Pista("With or without you", 360, "U2", "The Joshua Tree", 1987, "Rock");
		Pista p9 = new Pista("Vertigo", 355, "U2", "How to Dismantle an Atomic Bomb", 2004, "Rock");
		Pista p10 = new Pista("City of Blinding Lights", 284, "U2", "How to Dismantle an Atomic Bomb", 2004, "Rock");
		Pista p11 = new Pista("A la luz de la luna", 438, "El Indio Solari", "Pajaritos, bravos muchachitos", 2013, "Rock nacional");
		Pista p12 = new Pista("Yo Canibal", 258, "Patricio rey y sus redonditos de ricota", "Lobo Suelto, Cordero atado", 1993, "Rock nacional");
		
		Lista plist1 = new Lista("Clasicos del rock");
		plist1.add(p1);
		plist1.add(p2);
		plist1.add(p8);
		plist1.add(p9);
		plist1.add(p10);
		plist1.add(p12);
		
		Lista plist2 = new Lista("Lo mejor");
		plist2.add(p3);
		plist2.add(p4);
		plist2.add(p7);
		plist2.add(p12);
		plist2.add(p1);
		
		
		Lista plist3 = new Lista("Coldplay");		
		plist3.add(p5);
		plist3.add(p6);
		plist3.add(p7);
		
		Lista plist4 = new Lista("El indio");		
		plist4.add(p12);
		plist4.add(p11);	
		
		Lista coleccion = new Lista("Coleccion");
		coleccion.add(plist1);
		coleccion.add(plist2);
		coleccion.add(plist3);
		coleccion.add(plist4);
		
		//coleccion.borrar(p5);
		
		BuscarAlbum busqueda1 = new BuscarAlbum("la");
		//BuscarNombre busqueda2 = new BuscarNombre("El Tiempo No Para");
	//	BuscarDuracion busqueda3 = new BuscarDuracion(400);
		
		System.out.println(coleccion.getResumen());

		System.out.println(coleccion.buscador(busqueda1).size() + " elementos encontrados.");
		for (Pista p : coleccion.buscador(busqueda1)) System.out.println("- " + p.getNombre());
		
		//System.out.println(coleccion.getResumen());
	//	System.out.println(coleccion.getDuracion());
		
}
	}
