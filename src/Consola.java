public class Consola implements IConsole {
    private Plataforma plataforma;
    public Consola(Plataforma plataforma) {
        this.plataforma = plataforma;
    }
    @Override
    public void switchOn() {
        System.out.println("La consola está encendida.");
    }

    @Override
    public void switchOff() {
        System.out.println("La consola está apagada");
    }

    @Override
    public void installGame(Videojuegos juego) throws JuegoNoCompatibleException {
       if(this.plataforma.equals(juego.plataforma)){
           System.out.println("Instalando a la verga.");
       }else throw new JuegoNoCompatibleException();
    }



    @Override
    public String getPlataforma() {
        return plataforma.toString();
    }
}
