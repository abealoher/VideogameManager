public interface IConsole {

    void switchOn();

    void switchOff();

    void installGame(Videojuegos juego) throws JuegoNoCompatibleException;

    String getPlataforma();
}
