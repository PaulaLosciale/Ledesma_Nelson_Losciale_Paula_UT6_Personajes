// Subclase heredada de Persobaje
class PersonajeMagico extends Personaje {

    // Constructor heredado
    public PersonajeMagico(String nombre, int nivel, double salud) {
        super(nombre, nivel, salud);
    }

    /**
     * Metodo abstracto heredado de la superclase Personaje
     * Pero sobreescrito por la subclase
     */
    @Override
    public void atacar() {
        System.out.println("Ataque mediante hechizos magicos...");
    }

    // Metodo propio de la subclase
    public void poderMagicoExtra() {
        System.out.println("No sufre daño durante 40seg...");
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Nivel: " + nivel);
        System.out.println("Salud: " + salud);
        atacar();
        poderMagicoExtra();
    }

}