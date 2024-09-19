public class JuegosDigitales extends Videojuegos{
    double Descuento = 0.20;

    public JuegosDigitales(String Nombre, Generos Genero, String Consola, int Precio, int Descuento) {
        super(Nombre, Genero, Consola, Precio);
        this.Descuento = Descuento;
    }

    @Override
    public double preciofinal() {
        return PrecioVideojuego * Descuento;
    }
}
