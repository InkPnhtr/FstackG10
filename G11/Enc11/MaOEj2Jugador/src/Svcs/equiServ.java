/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Svcs;

import entid.Equipo;
import entid.Jugador;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author U
 */
public class equiServ {
    //EJERCICIO JUGADOR
/*Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición 
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho 
esto, desde el main recorreremos el equipo mostrando la información de cada jugador*/
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void cargaYmuestraEquipo() {
        Equipo e1 = new Equipo();
        ArrayList<Jugador> liJug = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Jugador j1 = new Jugador();
            j1.setApellido("Perez" + i);
            j1.setNombre("Lu" + i);
            j1.setNúmero("5" + i);
            j1.setPosición("POS " + i);
            liJug.add(j1);
        }

        e1.setJugadores(liJug);
        
        for (Jugador jugador : liJug) {
            System.out.println(jugador);

        }
        
        //for (Equipo e : e1) {
            
            
        System.out.println("Equipo = " + e1.toString());

    }
}
