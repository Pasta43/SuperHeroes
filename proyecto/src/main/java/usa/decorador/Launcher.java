package usa.decorador;

public class Launcher {
    public static void main(String[] args) {
        IHeroe batman = new Heroe();
        batman=new TenerDinero(batman);
        System.out.println("Batman: ");
        batman.operacion();
        
        IHeroe superman= new Heroe();
        superman=new SuperFuerza(superman);
        IHeroe ironMan = new Heroe();
        ironMan=new TenerDinero(ironMan);
        ironMan=new SeProgramar(ironMan);
        
        
        System.out.println("Súperman: ");
        superman.operacion();
        
        System.out.println("Ironman: ");
        ironMan.operacion();
        
        
        IHeroe santi= new TenerDinero(new SeProgramar(new SuperFuerza(new Heroe())));
        System.out.println("Santi: ");
        santi.operacion();
    }
}
