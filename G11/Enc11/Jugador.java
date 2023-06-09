/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 * Realiza un programa en donde exista una clase Jugador que contenga nombre,
 * apellido, posición y número.
 *
 * @author Pavilion
 */
public class Jugador {
 private String nombre, apellido;
 private int posicision, numero;

    public Jugador() {
    }

    public Jugador(String nombre, String apellido, int posicision, int numero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.posicision = posicision;
        this.numero = numero;
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

    public int getPosicision() {
        return posicision;
    }

    public void setPosicision(int posicision) {
        this.posicision = posicision;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", apellido=" + apellido + ", posicision=" + posicision + ", numero=" + numero + '}';
    }
 
 
}
