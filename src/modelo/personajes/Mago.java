package modelo.personajes;
import modelo.habilidades.ICurable;
import modelo.habilidades.IMagico;

public class Mago extends PersonajeMagico implements IMagico, ICurable {
    private int sabiduria;

    public Mago(String nombre, int nivel, double salud, int mana, int sabiduria) {
        super(nombre, nivel, salud, mana);
        this.sabiduria = sabiduria;
    }

    @Override
    public void atacar() {
        lanzarHechizo();
    }

    @Override
    public void lanzarHechizo() {
        System.out.println(nombre + " lanza un hechizo arcano de nivel " + sabiduria);
    }

    public void regenerarMana() {
        this.mana += 15;
        System.out.println(nombre + " regenera 15 puntos de maná");
    }

    @Override
    public void curar() {
        salud += 20;
        System.out.println(nombre + " se cura 20 puntos de salud");
    }
}