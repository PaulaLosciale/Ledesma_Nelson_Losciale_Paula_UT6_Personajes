import controlador.JuegoControlador;
import modelo.JuegoModelo;
import modelo.personajes.*;
import vista.JuegoVista;

public class Main {
    public static void main(String[] args) {
        // MVC
        JuegoModelo modelo = new JuegoModelo();
        JuegoVista vista = new JuegoVista();
        JuegoControlador controlador = new JuegoControlador(modelo, vista);

        // Crear personajes de ejemplo
        Guerrero guerrero = new Guerrero("GuerreroPrueba", 10, 100.0, 20, 15, true);
        Mago mago = new Mago("MagoPrueba", 8, 80.0, 50, 18);
        Arquero arquero = new Arquero("ArqueroPrueba", 12, 90.0, 15, 25, 20);
        Hechicero hechicero = new Hechicero("HechiceroPrueba", 13, 85.0, 60, 20);
        Asesino asesino = new Asesino("AsesinoPrueba", 14, 95.0, 18, 30, 25);

        // Agregar personajes al juego
        modelo.agregarPersonaje(guerrero);
        modelo.agregarPersonaje(mago);
        modelo.agregarPersonaje(arquero);
        modelo.agregarPersonaje(hechicero);
        modelo.agregarPersonaje(asesino);

        // Ejecutar el sistema
        controlador.ejecutar();
    }
}