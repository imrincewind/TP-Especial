package sitema;

import java.util.Vector;

public abstract class Files {
	String nombre;

public Files(String nomb) {
	nombre = nomb;
}
public String getNombre() {
	return nombre;
}
public abstract int getDuracion();
public abstract int getCantidad();
public abstract String getResumen();
public abstract boolean contiene(Pista p);
public abstract Vector<Pista> buscador(Busqueda b);
}
