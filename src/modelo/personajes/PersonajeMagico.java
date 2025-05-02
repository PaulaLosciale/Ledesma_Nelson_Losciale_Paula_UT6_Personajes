package modelo.personajes;

public abstract class PersonajeMagico extends Personaje {
    protected int mana;

    public PersonajeMagico(String nombre, int nivel, double salud, int mana) {
        super(nombre, nivel, salud);
        this.mana = mana;
    }

    public void meditar() {
        this.mana += 10;
        System.out.println(nombre + " medita y recupera 10 de maná");
    }

    public int getMana() {
        return mana;
    }
}