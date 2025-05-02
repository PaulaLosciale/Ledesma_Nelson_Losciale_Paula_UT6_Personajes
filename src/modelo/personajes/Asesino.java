package modelo.personajes;
import modelo.habilidades.ICurable;
import modelo.habilidades.IMovilizable;

public class Asesino extends PersonajeFisico implements IMovilizable, ICurable {
    private int sigilo;
    private int critico;

    public Asesino(String nombre, int nivel, double salud, int fuerza, int sigilo, int critico) {
        super(nombre, nivel, salud, fuerza);
        this.sigilo = sigilo;
        this.critico = critico;
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " ataca increíblemente con " + (fuerza + sigilo) + " de daño");
    }

    public void atacarPorLaEspalda() {
        System.out.println(nombre + " realiza un ataque crítico de " + (fuerza + critico) + " de daño");
    }

    public void ocultar() {
        System.out.println(nombre + " se esconde en las sombras");
    }

    @Override
    public void moverse() {
        System.out.println(nombre + " se mueve silencioso");
    }

    @Override
    public void curar() {
        salud += 15;
        System.out.println(nombre + " usa una poción mágica y recupera 15 de salud");
    }
}