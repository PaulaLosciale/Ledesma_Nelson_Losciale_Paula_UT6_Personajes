package modelo.personajes;
import modelo.habilidades.IVolador;

public class Arquero extends PersonajeFisico implements IVolador {
    private int agilidad;
    private int numFlechas;

    public Arquero(String nombre, int nivel, double salud, int fuerza, int agilidad, int numFlechas) {
        super(nombre, nivel, salud, fuerza);
        this.agilidad = agilidad;
        this.numFlechas = numFlechas;
    }

    @Override
    public void atacar() {
        if(numFlechas > 0) {
            System.out.println(nombre + " dispara una flecha con " + (fuerza + agilidad) + " de daño");
            numFlechas--;
        } else {
            System.out.println(nombre + " no tiene flechas para disparar!");
        }
    }

    public void dispararFlecha() {
        atacar(); // Reutiliza el método atacar
    }

    public void reabastecerFlechas() {
        numFlechas += 10;
        System.out.println(nombre + " reabastece su carcaj con 10 flechas");
    }

    @Override
    public void volar() {
        System.out.println(nombre + " salta a un punto elevado para ganar ventaja");
    }
}