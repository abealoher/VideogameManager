
public class VideogameManager {
    public static void main(String[] args) {
        System.out.println("Bienvenido al Gestor de Videojuegos");
        System.out.println("===================================");

        JuegosDigitales jd1= new JuegosDigitales(
                "Rocket League",Generos.Deportes, "PlayStation",20,7);
        String juego1 = jd1.toString();
        System.out.print(juego1);
    }
}