package usa.decorador;

public class SeProgramar extends SuperPoder{

    public SeProgramar(IHeroe heroe) {
        super(heroe);
    }

    @Override
    public void operacion() {
        super.operacion();
        System.out.println("¡¡Estudio lo más difícil!!");
    }
    
}
