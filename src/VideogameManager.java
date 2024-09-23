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
                "Rocket League", Generos.Deportes, "PlayStation", 20);
        String juego1 = jd1.toString();
        double pf1 = jd1.preciofinal();
        System.out.println(juego1);

        //Precio
        System.out.print("El precio final es: ");
        System.out.println(pf1 + "€");

        // Separador
        System.out.println("---");

        //Introducción de los Juegos Físicos
        System.out.println("Juegos Fisicos");
        System.out.println("--------------");

        //Llamada e introducción de los Datos de los juegos físicos
        JuegosFisicos jf1 = new JuegosFisicos(
                "Call of Duty", Generos.Accion, "PlayStation", 20, 7);
        String juego2 = jf1.toString();
        double pf2 = jf1.preciofinal();
        System.out.println(juego2);

        //Precio
        System.out.print("El precio final es: ");
        System.out.println(pf2 + "€");
    }
}