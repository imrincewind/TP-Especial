package sistema;

import java.util.Collections;
import java.util.Vector;

public class Lista extends ElementoMusical {

	Vector<ElementoMusical> lista;

	public Lista (String nomb){
		super(nomb);
		lista = new Vector <ElementoMusical>();
	}

	// Agrego un elemento a esta playlist (Pista o Playlist)
	public void add(ElementoMusical f) {
		lista.addElement(f);
	}

	// Cambio la posicion de los elementos de la playlist
	public void cambiarPosicion(int pos1, int pos2) {
		if( (pos1 < lista.size()) && (pos2 < lista.size()) && (pos1 >= 0) && (pos2 >= 0) )
			Collections.swap(lista, pos1, pos2);
	}

	// Obtengo la duracion de esta playlist
	public int getDuracion(){
		int dur=0;
		for (ElementoMusical f : lista) {
			dur += f.getDuracion();
		}
		return dur;
	}

	// Realizo una busqueda de pistas utilizando un criterio determinado
	public Vector<Pista> buscador(Busqueda b) {
		Vector<Pista> resultado = new Vector<Pista>();
		for (ElementoMusical f : lista){
			resultado.addAll(f.buscador(b));
		}
		return resultado;
	}

	// Obtengo la cantidad de elementos en esta playlist.
	public int getCantidad() {
		int cant=0;
		for (ElementoMusical f : lista) {
			cant += f.getCantidad();
		}
		return cant;
	}

	// Obtengo un string con todos los elementos de esta playlist
	public String toString() {
		String resumen = nombre.toUpperCase() + "\n";
		for (ElementoMusical f : lista) {
			resumen += f.toString() + "\n";
		}
		return resumen;
	}


    public boolean equals(Object o1) {
        if (o1 instanceof Lista) {
            Lista l = (Lista)o1;
            return nombre.equals(l.getNombre());
        }
        return false;
    }

    // Elimino una pista o playlist de esta playlist
	public void eliminar(ElementoMusical em) {

        lista.remove(em);
        for (ElementoMusical e: lista) {
            e.eliminar(em);
        }

    }
	
}