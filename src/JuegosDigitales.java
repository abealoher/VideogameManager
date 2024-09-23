public class JuegosDigitales extends Videojuegos {
    double Descuento = 0.20;

    public JuegosDigitales(String Nombre, Generos Genero, String Consola, double Precio) {
        super(Nombre, Genero, Consola, Precio);
    }

    @Override
    public double preciofinal() {
        return getPrecioVideojuego() - (getPrecioVideojuego() * Descuento);
    }
}
