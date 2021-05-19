package usa.decorador;

public class SuperFuerza extends SuperPoder{

    public SuperFuerza(IHeroe heroe) {
        super(heroe);
    }

    @Override
    public void operacion() {
        super.operacion();
        System.out.println("¡¡Tengo fuerza!!");
    }
    
}
