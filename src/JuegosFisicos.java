public class JuegosFisicos extends Videojuegos {
    int CosteEnvio = 7;

    public JuegosFisicos(String Nombre, Generos Genero, Plataforma Consola, int value, int CosteEnvio) {
        super(Nombre, Genero, Consola, value);
        this.CosteEnvio = CosteEnvio;
        CalculaPrecio();
    }


    @Override
    public void CalculaPrecio() {
        this.value = value + CosteEnvio;
    }
}
