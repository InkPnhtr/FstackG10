/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servi;

import Enti.Juego;
import Enti.Jugador;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author U
 */
public class JuegServi {

    /*Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.

10
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.*/
    Juego jue = new Juego();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Jugador> AuxJugadores = new ArrayList<>();

    public void llenarJuego() {
        boolean b = true;
        int i = 1;
        while (b) {
            Jugador jug = new Jugador();
            System.out.print("Ing nombre Jugador " + i + "(Max=6 ing x para finalizar)"
                    + ""
                    + ""
                    + ""
                    + ""
                    +  : ");
            jug.setNombre(leer.next());
            jug.setId(i);
            i++;
            if (jug.getNombre().equalsIgnoreCase("x") || i > 7) {
                b = false;
                break;
            }
            AuxJugadores.add(jug);
        }
        jue.setJugadores(AuxJugadores);
        System.out.println(jue.getJugadores());
    }

    public boolean ronda() {
        RevolverSevi rs = new RevolverSevi();
        JugServ js = new JugServ();

        rs.llenarRevolver();
        boolean x=false;
        while (!x) {
            for (Jugador AuxJugadore : jue.getJugadores()) {
                x = js.disparo(rs, AuxJugadore);
                if (x){
                    jue.getJugadores().remove(AuxJugadore);
                    break;
                }
            }
            System.out.println(jue.getJugadores());
        }
        System.out.println(jue.getJugadores().size());
        return (jue.getJugadores().size()) > 1;
    }
    
    public Juego pasarArrayGanador (){
        return jue;
    }
}
