package usa.decorador;


public abstract class SuperPoder implements IHeroe{
    IHeroe heroe;

    public SuperPoder(IHeroe heroe) {
        this.heroe = heroe;
    }

    @Override
    public void operacion(){
        heroe.operacion();
    }
    
}
