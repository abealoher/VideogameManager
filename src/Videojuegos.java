public abstract class Videojuegos {

    String NombreVideojuego;
    String GeneroVideojuego;
    String ConsolaVideojuego;
    int PrecioVideojuego;

    public Videojuegos(String Nombre, Generos Genero, String Consola, int Precio){
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

}
