package modelo;

import modelo.habilidades.*;
import modelo.personajes.*;

import java.util.ArrayList;
import java.util.List;

public class JuegoModelo {
    private List<Personaje> personajes;

    public JuegoModelo() {
        this.personajes = new ArrayList<>();
    }

    public void agregarPersonaje(Personaje personaje) {
        personajes.add(personaje);
    }

    public void mostrarAcciones() {
        System.out.println("Acciones de personajes\n-------------------------------------------------");
        for(Personaje p : personajes) {
            p.atacar();

            // Usando instanceof para habilidades especiales
            if(p instanceof IDefendible) ((IDefendible) p).defender();
            if(p instanceof IMagico) ((IMagico) p).lanzarHechizo();
            if(p instanceof IVolador) ((IVolador) p).volar();
            if(p instanceof IMovilizable) ((IMovilizable) p).moverse();
            if(p instanceof ICurable) ((ICurable) p).curar();

            // Métodos específicos de clases
            if(p instanceof Guerrero) ((Guerrero) p).cargarAtaque();
            if(p instanceof Mago) ((Mago) p).regenerarMana();
            if(p instanceof Arquero) ((Arquero) p).reabastecerFlechas();
            if(p instanceof Hechicero) ((Hechicero) p).invocarEntidad();
            if(p instanceof Asesino) ((Asesino) p).ocultar();

            System.out.println("-------------------------------------------------");
        }
    }
}