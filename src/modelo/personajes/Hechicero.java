package modelo.personajes;
import modelo.habilidades.IDefendible;
import modelo.habilidades.IMagico;

public class Hechicero extends PersonajeMagico implements IMagico, IDefendible {
    private int concentracion;

    public Hechicero(String nombre, int nivel, double salud, int mana, int concentracion) {
        super(nombre, nivel, salud, mana);
        this.concentracion = concentracion;
    }

    @Override
    public void atacar() {
        lanzarHechizo();
    }

    @Override
    public void lanzarHechizo() {
        System.out.println(nombre + " invoca energía arcana con concentración " + concentracion);
    }

    public void invocarEntidad() {
        System.out.println(nombre + " invoca una entidad mística");
    }

    @Override
    public void defender() {
        System.out.println(nombre + " conjura un escudo mágico de protección");
    }
}