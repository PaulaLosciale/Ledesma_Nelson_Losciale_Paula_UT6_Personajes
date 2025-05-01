abstract class Personaje {
    // Atributos
    protected String nombre;
    protected int nivel;
    protected double salud;

    // Constructor
    public Personaje(String nombre, int nivel, double salud) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
    }

    // Metodo abstracto
    public abstract void atacar();

    // Metodo toString personalizado
    @Override
    public String toString() {
        return "Nombre: " + nombre + " | " +" Nivel: " + nivel + " | " + " Salud: " + salud + "\n";
    }

    // Metodo hashCode personalizado
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + nivel;
        long temp;
        temp = Double.doubleToLongBits(salud);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    // Metodo equals personalizado
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Personaje other = (Personaje) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (nivel != other.nivel)
            return false;
        if (Double.doubleToLongBits(salud) != Double.doubleToLongBits(other.salud))
            return false;
        return true;
    }

}