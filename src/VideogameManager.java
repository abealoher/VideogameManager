public class VideogameManager {
    public static void main(String[] args) {
        //Cabecera
        System.out.println("Bienvenido al Gestor de Videojuegos");
        System.out.println("===================================");

        //Introducción de los Juegos Digitales
        System.out.println("Juegos Digitales");
        System.out.println("----------------");

        //Llamada e introducción de los Datos de los juegos digitales
        JuegosDigitales jd1 = new JuegosDigitales(
                "Rocket League", Generos.Deportes, Plataforma.PlayStation, 20, 20);
        String juego1 = jd1.toString();
        System.out.println(juego1);

        //Precio
        System.out.printf("El precio final es: %d€%n", jd1.value);

        // Separador
        System.out.println("---");

        //Introducción de los Juegos Físicos
        System.out.println("Juegos Fisicos");
        System.out.println("--------------");

        //Llamada e introducción de los Datos de los juegos físicos
        JuegosFisicos jf1 = new JuegosFisicos(
                "Call of Duty", Generos.Accion, Plataforma.Xbox, 20, 7);
        String juego2 = jf1.toString();
        System.out.println(juego2);

        //Precio
        System.out.printf("El precio final es: %d€", jf1.value);
    }
}