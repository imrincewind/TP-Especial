package sistema;

import java.util.Vector;

public class Pista extends ElementoMusical{

    int duracionSegs;
    String artista;
    String album;
    int id;
    int anio;
    String genero;
    String comentario;

    public Pista(int _id, String nomb,int duraSegs,String artist, String alb, int ani, String gener) {
        super(nomb);
        id = _id;
        duracionSegs = duraSegs;
        artista = artist;
        album = alb;
        anio = ani;
        genero = gener;
    }

    public Pista(int _id, String nomb,int duraSegs,String artist, String alb, int ani, String gener, String coment){
        this(_id, nomb, duraSegs, artist, alb, ani, gener);
        comentario = coment;
    }

    public String toString() {
        String resumen = "ID: " + id + ". Nombre: " + nombre +  ". Duraci�n: " + duracionSegs + " segs. Artista: " + artista + ". Album: " + album + ". A�o: " + anio + ". Genero: " + genero;
        if(comentario != null) resumen +=  ". Comentario: " +comentario + ".";
        return resumen;
    }


    public boolean equals(Object o1) {
        if (o1 instanceof Pista) {
            Pista p = (Pista) o1;
            return id == p.getId() && nombre.equals(p.getNombre()) && duracionSegs == p.getDuracion() && artista.equals(p.getArtista()) &&
                    album.equals(p.getAlbum()) && anio == p.getAnio() && genero.equals(p.getGenero());
        }
        return false;
    }
    public int getCantidad() { return 1; }

    public Vector<Pista> buscador(Busqueda b) {
        Vector <Pista> resultado = new Vector<Pista>();
        if(b.busqueda(this)){
            resultado.add(this);
        }
        return resultado;
    }

    public void eliminar(ElementoMusical em) {}

    public int getId() { return id; }
    public String getNombre(){
        return nombre;
    }
    public int getDuracion(){
        return duracionSegs;
    }
    public String getArtista(){
        return artista;
    }
    public String getAlbum(){
        return album;
    }
    public int getAnio(){
        return anio;
    }
    public String getGenero(){
        return genero;
    }
    public String getComentario(){
        return comentario;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public void setDuracionSegs(int duracionSegs) {
        this.duracionSegs = duracionSegs;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}