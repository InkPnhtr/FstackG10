/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1g11perropersona;

import Enti.Perro;
import Enti.Persona;
import java.util.ArrayList;

/**
 *
 * @author U
 */
public class Ej1G11PerroPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona*/

        ArrayList<Perro> pe1 = new ArrayList<>();
        for (int i = 1; i < 3; i++) {
            Perro pe = new Perro();
            pe.setNombre("Chi" + i);
            pe.setRaza("Rotwailer" + i);
            pe.setTamaño("Peque" + i);
            pe.setEdad(i);
            pe1.add(pe);
        }

        ArrayList<Persona> p1 = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            Persona p = new Persona();
            p.setApellido("Gomez" + i);
            p.setNombre("Ali" + i);
            p.setDocumento(5555555 + i);
            p.setEdad(20 + i);
            p.setPerro(pe1.get(i));
            p1.add(p);
            

        }


        for (Persona persona : p1) {
            System.out.println(persona);
            System.out.println("");

        }

    }
}
