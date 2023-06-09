package ejercicio2jugador;

import Entidad.Equipo;
import Entidad.Jugador;
import java.util.*;

public class Ejercicio2Jugador {

    /**
     * Realiza un programa en donde exista una clase Jugador que contenga
     * nombre, apellido, posición y número. Luego otra clase Equipo que contenga
     * una colección de jugadores. Una vez hecho esto, desde el main
     * recorreremos el equipo mostrando la información de cada jugador.
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        List<Jugador> jg = new ArrayList();
        String continuar = "";
        do {
            Jugador jugador = new Jugador();
            System.out.println("Ingrse nombre");
            jugador.setNombre(sc.next());
            System.out.println("Ingrese apellido");
            jugador.setApellido(sc.next());
            System.out.println("Ingrese posicision");
            jugador.setPosicision(sc.nextInt());
            System.out.println("Ingrese numero");
            jugador.setNumero(sc.nextInt());
            jg.add(jugador);

            System.out.println("Quiere ingresar mas jugadores");
            continuar = sc.next();

        } while (!"N".equalsIgnoreCase(continuar));

        for (Jugador auxJugador : jg) {

            System.out.println(auxJugador);

        }

    }
}
