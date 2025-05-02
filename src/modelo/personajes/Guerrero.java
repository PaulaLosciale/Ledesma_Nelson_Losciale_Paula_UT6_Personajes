package modelo.personajes;
import modelo.habilidades.IDefendible;

public class Guerrero extends PersonajeFisico implements IDefendible {
    private int armadura;
    private boolean tieneEscudo;

    public Guerrero(String nombre, int nivel, double salud, int fuerza, int armadura, boolean tieneEscudo) {
        super(nombre, nivel, salud, fuerza);
        this.armadura = armadura;
        this.tieneEscudo = tieneEscudo;
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " ataca con espada causando " + (fuerza * 1.5) + " de daño físico");
    }

    public void cargarAtaque() {
        System.out.println(nombre + " carga su ataque para el próximo turno");
    }

    @Override
    public void defender() {
        System.out.println(nombre + " defiende con su " + (tieneEscudo ? "escudo" : "armadura"));
    }
}