package TPEspecial;

public class BuscarDuracion extends Busqueda {
	
	int tiempo;
	
	public BuscarDuracion(int t) {
		tiempo = t;
	}
		
	public boolean busqueda(Pista p) {
		return(p.getDuracion() >= tiempo);
	}
		
}
