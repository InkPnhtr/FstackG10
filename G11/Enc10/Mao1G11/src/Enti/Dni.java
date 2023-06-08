/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enti;

/**
 *
 * @author U
 */
public class Dni {
    /*EJERCICIO PERSONA
Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.*/
    private int nro;
    private char serie;

    public Dni() {
    }

    public Dni(int nro, char serie) {
        this.nro = nro;
        this.serie = serie;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public char getSerie() {
        return serie;
    }

    public void setSerie(char serie) {
        this.serie = serie;
    }

    @Override
    public String toString() {
        return "Dni{" + nro + ", serie=" + serie + '}';
    }
    
    
}
