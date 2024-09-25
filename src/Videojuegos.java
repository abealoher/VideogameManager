import java.util.Objects;

public abstract class Videojuegos implements IVideojuego{

    private String NombreVideojuego;
    private String GeneroVideojuego;
    private String Plataforma;
    public int value;
    Plataforma plataforma;

    public Videojuegos(String Nombre, Generos Genero, Plataforma plataforma, int value){
        this.NombreVideojuego = Nombre;
        this.GeneroVideojuego = Genero.toString();
        this.Plataforma = plataforma.toString();
        this.value = value;
    }

    @Override
    public String toString() {
        return "Nombre='" + NombreVideojuego + '\'' +
                ", Genero='" + GeneroVideojuego + '\'' +
                ", Consola='" + Plataforma + '\'' +
                ", Precio=" + value + '€';
    }

    public String getPlataforma() {
        return Plataforma;
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
                    && this.Plataforma == v.Plataforma
                    && this.value == v.value;
        }
        return testOK;
    }

    @Override
    public int hashCode() {
        return Objects.hash(NombreVideojuego, GeneroVideojuego, Plataforma, value);
    }
}
