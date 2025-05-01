// Sublclase heredada de Personaje
class PersonajeFisico extends Personaje {

    // Constructor heredado
    public PersonajeFisico(String nombre, int nivel, double salud) {
        super(nombre, nivel, salud);
    }

    /**
     * Metodo abstracto heredado de la superclase Personaje
     * Pero sobreescrito por la subclase
     */
    @Override
    public void atacar() {
        System.out.println("Ataca Físicamente...");
    }
    
    // Metodo propio de la subclase
    public void poderFisicoExtra() {
        System.out.println("Fuerza doble por 20 segundos..");
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Nivel: " + nivel);
        System.out.println("Salud: " + salud);
        atacar();
        poderFisicoExtra();
    }

}