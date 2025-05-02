package modelo.personajes;

import java.util.Objects;

public abstract class Personaje {
    protected String nombre;
    protected int nivel;
    protected double salud;

    public Personaje(String nombre, int nivel, double salud) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
    }

    public abstract void atacar();

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + nombre + " (Nivel " + nivel + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personaje personaje = (Personaje) o;
        return nivel == personaje.nivel &&
                Double.compare(personaje.salud, salud) == 0 &&
                Objects.equals(nombre, personaje.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, nivel, salud);
    }

    // Getters
    public String getNombre() { return nombre; }
    public int getNivel() { return nivel; }
    public double getSalud() { return salud; }
    public void setSalud(double salud) { this.salud = salud; }
}