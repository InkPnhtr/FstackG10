/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servi;

import Enti.Jugador;

/**
 *
 * @author U
 */
public class JugServ {

    /*• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.*/
    //Jugador jug = new Jugador();
    public boolean disparo(RevolverSevi revolverSevi, Jugador jug) {
        if (revolverSevi.mojar()) {
            System.out.println(jug.toString() + " SE MOJO!(fin ronda)");
            jug.setMojado(true);
            System.out.println(jug.toString());
            revolverSevi.siguienteChorro();
            return true;
        } else {
            System.out.println(jug.toString());
            revolverSevi.siguienteChorro();
            return false;
        }
    }
}
