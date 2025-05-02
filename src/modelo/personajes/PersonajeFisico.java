package modelo.personajes;

public abstract class PersonajeFisico extends Personaje {
    protected int fuerza;

    public PersonajeFisico(String nombre, int nivel, double salud, int fuerza) {
        super(nombre, nivel, salud);
        this.fuerza = fuerza;
    }

    public void entrenar() {
        this.fuerza += 5;
        System.out.println(nombre + " ha entrenado! Fuerza aumentada a " + fuerza);
    }

    public int getFuerza() {
        return fuerza;
    }
}