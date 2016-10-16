package sitema;

import java.util.Collections;
import java.util.Vector;

public class Lista extends ElementoMusical {
	Vector<ElementoMusical> lista;

	public Lista (String nomb){
		super(nomb);
		lista = new Vector <ElementoMusical>();
	}

	public void add(ElementoMusical f) {
		lista.addElement(f);
	}

	public int getDuracion(ElementoMusical f){
		return f.getDuracion();
	}

	public void cambiarPosicion(int pos1, int pos2) {
		if( (pos1 < lista.size()) && (pos2 < lista.size()) && (pos1 >= 0) && (pos2 >= 0) )
			Collections.swap(lista, pos1, pos2);
	}

	public int getDuracion(){
		int dur=0;
		for (ElementoMusical f : lista) {
			dur += f.getDuracion();
		}
		return dur;
	}
	public Vector<Pista> buscador(Busqueda b) {
		Vector<Pista> resultado = new Vector<Pista>();
		for (ElementoMusical f : lista){
			resultado.addAll(f.buscador(b));
		}
		return resultado;
	}

	public int getCantidad() {
		int cant=0;
		for (ElementoMusical f : lista) {
			cant += f.getCantidad();
		}
		return cant;
	}
	public String getResumen() {
		String resumen = nombre.toUpperCase() + "\n";
		for (ElementoMusical f : lista) {
			resumen += f.getResumen() + "\n";
		}
		return resumen;
	}

	public boolean contiene(Pista p) {
		return lista.contains(p);
	}


	public void borrar(Pista p) {
		for(int i = 0; i < lista.size();i++){
			if(lista.elementAt(i).contiene(p)){
				((Lista)lista.elementAt(i)).delete(p);
			}
		}
	}

	private void delete(Pista p) {
		lista.remove(p);
	}


}