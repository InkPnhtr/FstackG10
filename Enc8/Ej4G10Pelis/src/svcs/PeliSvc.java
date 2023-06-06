/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package svcs;

import enti.Pelicula;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author U
 */
public class PeliSvc {

    /*En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

22

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.**/
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<Pelicula> ingrePeli() {
        ArrayList<Pelicula> peliculas = new ArrayList<>();
        boolean x = true;
        do {
            Pelicula peli = new Pelicula();
            System.out.print("Ing Titulo Peli: ");
            peli.setTitulo(leer.next());
            System.out.print("Ing Director: ");
            peli.setDirector(leer.next());
            System.out.print("Ing Duracion (hs): ");
            peli.setDuracion(leer.nextDouble());
            System.out.print("Otra?");
            if (leer.next().equalsIgnoreCase("N")) {
                x = false;
            }
            peliculas.add(peli);
        } while (x);
        return peliculas;

    }

    public void mostrarTodasPelis(ArrayList<Pelicula> peliculas) {
        System.out.println("Lista Completa:");
        //peliculas.toString();
        Iterator<Pelicula> it = peliculas.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

}
