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
public class Animal {
    /*La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:*/
    
    protected String nombre;
    protected String alimento;
    protected String raza;
    protected int edad;

    public Animal(String nombre, String alimento, String raza, int edad) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.raza = raza;
        this.edad = edad;
    }
    
    
    
    public void mostrarAlim(){
        System.out.println(nombre + "se alimenta de: " + alimento);
    }
    
    
    
}
