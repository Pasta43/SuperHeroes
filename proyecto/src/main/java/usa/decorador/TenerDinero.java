package usa.decorador;

public class TenerDinero extends SuperPoder{

    public TenerDinero(IHeroe heroe) {
        super(heroe);
    }

    @Override
    public void operacion() {
        super.operacion();
        System.out.println("¡¡Tengo dinero!!");
    }
    
}
