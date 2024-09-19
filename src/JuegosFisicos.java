public class JuegosFisicos extends Videojuegos {
    int CosteEnvio = 7;

    public JuegosFisicos(String Nombre, Generos Genero, String Consola, int Precio, int CosteEnvio) {
        super(Nombre, Genero, Consola, Precio);
        this.CosteEnvio = CosteEnvio;
    }

    @Override
    public double preciofinal() {
        return PrecioVideojuego + CosteEnvio;
    }



}
