/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serv;

import Enti.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author U
 */
public class AlumnoServicio {

    /*En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main. */
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<Alumno> crearListaAlumnos() {
        ArrayList<Alumno> alumnos = new ArrayList();
        boolean x = true;
        do {
            Alumno alumno = new Alumno();
            System.out.print("Ing Nombre Alumno: ");
            alumno.setNombre(leer.next());
            System.out.println("Ing Notas (3?): ");
            ArrayList<Integer> notas = new ArrayList();
            for (int i = 0; i < 3; i++) {
                notas.add(leer.nextInt());
            }
            alumno.setNotas(notas);
            alumnos.add(alumno);
            System.out.print("Agrega otro alumno (S/N)? ");
            if (leer.next().equalsIgnoreCase("N")){
                x=false;
            }
        }while(x);
        return alumnos;
    }
    public Double notaFinal(ArrayList<Alumno> alumnos){
        System.out.print("Ing. Nombre Alumno a Buscar: ");
        String alumnoABuscar = leer.next();
        Iterator<Alumno> itAl = alumnos.iterator();
        while(itAl.hasNext()){
            Alumno alumnoAuxiliar = itAl.next();
            if (alumnoAuxiliar.getNombre().equalsIgnoreCase(alumnoABuscar)){
                return promedio(alumnoAuxiliar);
            }
        }
        return null;
    }
    public double promedio (Alumno alumno){
        double sumNotas = 0;
        for (Integer nota : alumno.getNotas()) {
            sumNotas += nota;
        }
        return sumNotas / alumno.getNotas().size();
    }
}
