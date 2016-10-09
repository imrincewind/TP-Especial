package sitema;

import java.util.Vector;

public class Pista extends Files{
int duracionSegs;
String artista;
String album;
int id;
int anio;
String genero;
private static int contador_id = 1;
String comentario;
	public Pista(String nomb,int duraSegs,String artist, String alb, int ani, String gener) {
		super(nomb);
		id = contador_id;
		contador_id++;
		duracionSegs = duraSegs;
		artista = artist;
		album = alb;
		anio = ani;
		genero = gener;
	}
	public Pista(String nomb,int duraSegs,String artist, String alb, int ani, String gener, String coment){
		this(nomb, duraSegs, artist, alb, ani, gener);
		comentario = coment;
	}
	
public String getNombre(){
	return nombre;
}

public int getDuracion(){
	return duracionSegs;
}public String getArtista(){
	return artista;
}public String getAlbum(){
	return comentario;
}public int getAnio(){
	return anio;
}public String getGenero(){
	return genero;
}public String getComentario(){
	return comentario;
}
public String getResumen() {
	//String resumen = id  
	 return  "ID: " + id + ". Nombre: " + nombre +  ". Duración: " + duracionSegs + " segs. Artista: " + artista + ". Album: " + album + ". Año: " + anio + ". Genero: " + genero + ". Comentario: " + comentario + ".";
}

public boolean equals(Object o1) {
	return nombre.equals(((Pista)o1).getNombre());
}
public int getCantidad() {
	// TODO Auto-generated method stub
	return 1;
}

public boolean contiene(Pista p) {
	return equals(p);
}
@Override
public Vector<Pista> buscador(Busqueda b) {
	Vector <Pista> resultado = new Vector<Pista>();
	if(b.busqueda(this)){
		resultado.add(this);
	}
	return resultado;
	
}
}
