package sistema;

public class BOr extends Busqueda{

    Busqueda b1;
    Busqueda b2;

    public BOr(Busqueda _b1, Busqueda _b2){
        b1 = _b1;
        b2 = _b2;
    }
    public boolean busqueda(Pista p){
        return b1.busqueda(p) || b2.busqueda(p);
    }
}
