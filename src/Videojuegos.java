import java.util.Objects;

public abstract class Videojuegos {

    private String NombreVideojuego;
    private String GeneroVideojuego;
    private String ConsolaVideojuego;
    private double PrecioVideojuego;

    public Videojuegos(String Nombre, Generos Genero, String Consola, double Precio){
        this.NombreVideojuego = Nombre;
        this.GeneroVideojuego = Genero.toString();
        this.ConsolaVideojuego = Consola;
        this.PrecioVideojuego = Precio;
    }

    public abstract double preciofinal();

    @Override
    public String toString() {
        return "Nombre='" + NombreVideojuego + '\'' +
                ", Genero='" + GeneroVideojuego + '\'' +
                ", Consola='" + ConsolaVideojuego + '\'' +
                ", Precio=" + PrecioVideojuego + '€';
    }

    public String getNombreVideojuego() {
        return NombreVideojuego;
    }

    public void setNombreVideojuego(String nombreVideojuego) {
        NombreVideojuego = nombreVideojuego;
    }

    public String getGeneroVideojuego() {
        return GeneroVideojuego;
    }

    public void setGeneroVideojuego(String generoVideojuego) {
        GeneroVideojuego = generoVideojuego;
    }

    public String getConsolaVideojuego() {
        return ConsolaVideojuego;
    }

    public void setConsolaVideojuego(String consolaVideojuego) {
        ConsolaVideojuego = consolaVideojuego;
    }

    public double getPrecioVideojuego() {
        return PrecioVideojuego;
    }

    public void setPrecioVideojuego(double precioVideojuego) {
        PrecioVideojuego = precioVideojuego;
    }

    @Override
    public boolean equals(Object o) {
        //Valor de Retorno
        boolean testOK;
        //Discriminacion
        if (o == null){
            testOK = false;
        } else if (o instanceof Videojuegos) {
            testOK = false;
        } else {
            Videojuegos v = (Videojuegos) o;
            testOK = this.NombreVideojuego == v.NombreVideojuego
                    && this.GeneroVideojuego == v.GeneroVideojuego
                    && this.ConsolaVideojuego == v.ConsolaVideojuego
                    && this.PrecioVideojuego == v.PrecioVideojuego;
        }
        return testOK;
    }

    @Override
    public int hashCode() {
        return Objects.hash(NombreVideojuego, GeneroVideojuego, ConsolaVideojuego, PrecioVideojuego);
    }
}
