package Enti;

import java.util.*;

public class Alumno
 {
    private String Nombre;
    private ArrayList<Integer> notas;
    


    /*Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas. */


    
    
    public Alumno(String nombre, ArrayList<Integer> notas) {
        Nombre = nombre;
        this.notas = notas;
    }
    public Alumno() {
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public ArrayList<Integer> getNotas() {
        return notas;
    }
    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Alumno{" + "Nombre=" + Nombre + ", notas=" + notas + '}';
    }





}
