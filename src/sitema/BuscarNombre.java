package sitema;

public class BuscarNombre extends Busqueda {
	String ele1;
	
public BuscarNombre(String s) {
	ele1 = s;
}
	
public boolean busqueda(Pista p) {
	return p.getNombre().toLowerCase().indexOf(ele1.toLowerCase()) >= 0;
}
	
	
}
