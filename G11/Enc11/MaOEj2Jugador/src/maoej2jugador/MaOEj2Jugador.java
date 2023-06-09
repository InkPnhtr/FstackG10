/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maoej2jugador;

import Svcs.equiServ;

/**
 *
 * @author U
 */
public class MaOEj2Jugador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //EJERCICIO JUGADOR
/*Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición 
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho 
esto, desde el main recorreremos el equipo mostrando la información de cada jugador*/
        equiServ es = new equiServ();
        es.cargaYmuestraEquipo();
    }

}
