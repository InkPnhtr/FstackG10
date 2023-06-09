/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mao1g11;

import Enti.Dni;
import Enti.Persona;
import java.util.Scanner;

/**
 *
 * @author U
 */
public class Mao1G11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*EJERCICIO PERSONA
Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.*/
        Persona per1 = new Persona();
        Dni dni = new Dni();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ing Apellido");
        per1.setApellido(leer.next());
        System.out.println("Ing Nombre");
        per1.setNombre(leer.next());
        System.out.println("Ing Serie char");
        dni.setSerie(leer.next().charAt(0));
        System.out.println("Ing DNI");
        dni.setNro(leer.nextInt());
        
        per1.setDni(dni);
        
        System.out.println(per1.toString());

    }

}
