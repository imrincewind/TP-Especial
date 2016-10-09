package sitema;

import java.util.Collections;
import java.util.Vector;

public class Lista extends Files {
	Vector<Files> lista;

	public Lista (String nomb){
		super(nomb);
		lista = new Vector <Files>();
	}
	
	public void add(Files f) {
		lista.addElement(f);
	}
	
	public int getDuracion(Files f){
		return f.getDuracion();
	}
	
	public void cambiarPosicion(int pos1, int pos2) {
		if( (pos1 < lista.size()) && (pos2 < lista.size()) && (pos1 >= 0) && (pos2 >= 0) )
		Collections.swap(lista, pos1, pos2);
	}
	
	public int getDuracion(){
		int dur=0;
		for (Files f : lista) {
			dur += f.getDuracion();
		}
		return dur;
	}
	public Vector<Pista> buscador(Busqueda b) {
		Vector<Pista> resultado = new Vector<Pista>();
		for (Files f : lista){
			resultado.addAll(f.buscador(b));
		}
		for (Pista p : resultado){
			System.out.println(p.getResumen());
	//		System.out.println(p.toString());
		}
		return resultado;
	}
	@Override
	public int getCantidad() {
		int cant=0;
		for (Files f : lista) {
			cant += f.getCantidad();
		}
		return cant;
	}
	public String getResumen() {
		String resumen = "La lista " + nombre + " posee los siguientes temas:\n";
		for (Files f : lista) {
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