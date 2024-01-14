package observer;

public class LibroObserver implements Observer{
    @Override
    public void update() {
        System.out.println("update");
    }
    @Override
    public void update(String mensaje) {
        System.out.println(mensaje);
    }
}
