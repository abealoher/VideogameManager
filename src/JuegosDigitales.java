public class JuegosDigitales extends Videojuegos {
    int Descuento;


    public JuegosDigitales(String Nombre, Generos Genero, Plataforma Consola, int value, int descuento) {
        super(Nombre, Genero, Consola, value);
        this.Descuento = descuento;
        CalculaPrecio();
    }


    @Override
    public void CalculaPrecio() {
        int porcentaje = (value * Descuento) / 100;
        this.value = value - porcentaje;
    }
}
