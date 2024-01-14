package observer;

public class Ejemplo2Observer implements Observer{
    @Override
    public void update() {

        System.out.println("Se ha llamado a ejemplo2");
    }

    @Override
    public void update(String mensaje) {

    }
}
