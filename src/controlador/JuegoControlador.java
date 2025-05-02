package controlador;

import modelo.JuegoModelo;
import vista.JuegoVista;

public class JuegoControlador {
    private JuegoModelo modelo;
    private JuegoVista vista;

    public JuegoControlador(JuegoModelo modelo, JuegoVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void ejecutar() {
        vista.mostrarMensaje("Personajes de juego RPG");
        modelo.mostrarAcciones();
    }
}