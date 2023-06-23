/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1g12animalesdesdeelmain;

import entid.Animal;
import entid.Caballo;
import entid.Gato;
import entid.Perro;

/**
 *
 * @author U
 */
public class Ej1G12AnimalesDesdeElMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Decla Objet Perro
        Animal perro1 = new Perro("stich", "carniv", "Dober", 15);
        perro1.mostrarAlim();
        
        //Decla Objet Perro
        Animal perro2 = new Perro("Teddy", "Croquetas", "Chihuahua", 10);
        perro2.mostrarAlim();
        
        //Decla Objet Gato
        Animal gato1 = new Gato("Pelusa", "Galletitas", "Siamees", 14);
        gato1.mostrarAlim();
        
        //Decla Objet Caballo
        Animal caballo1 = new Caballo("Spark", "Pasto", "Fino", 25);
        caballo1.mostrarAlim();
        
    }
    
}
