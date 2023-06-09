/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entid;

/**
 *
 * @author U
 */
public class Jugador {
    /*EJERCICIO JUGADOR
Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición 
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho 
esto, desde el main recorreremos el equipo mostrando la información de cada jugador*/
    String nombre;
    String apellido;
    String posición;
    String número;

    public Jugador() {
    }

    public Jugador(String nombre, String apellido, String posición, String número) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.posición = posición;
        this.número = número;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPosición() {
        return posición;
    }

    public void setPosición(String posición) {
        this.posición = posición;
    }

    public String getNúmero() {
        return número;
    }

    public void setNúmero(String número) {
        this.número = número;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", apellido=" + apellido + ", posici\u00f3n=" + posición + ", n\u00famero=" + número + '}';
    }
    
    
    
    
}
