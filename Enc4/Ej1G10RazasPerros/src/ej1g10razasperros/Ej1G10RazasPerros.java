/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1g10razasperros;

import java.util.ArrayList;
import static java.util.Arrays.sort;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author U
 */
public class Ej1G10RazasPerros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> razas = new ArrayList<>();
        Scanner leer = new Scanner(System.in);
        boolean conf = true;

        do {
            System.out.print("Ing una Raza Pero: ");
            razas.add(leer.next());
            System.out.print("Ing Otra raza? (S/N) ");
            if (leer.next().equalsIgnoreCase("N")) { // Confirmacion s/n
                conf = false;
            }
        } while (conf);

        Iterator it = razas.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        boolean nhay = false;
        System.out.print("Ing una raza p borrar:");
        String perroBorrar = leer.next();
        Iterator it1 = razas.iterator();
        while (it1.hasNext()) {
            if (it1.next().equals(perroBorrar)) {
                it1.remove();
                nhay = true;
            }
        }

        System.out.println(nhay);
        if (!nhay) {
            System.out.println("No HAy!");
        }

        Collections.sort(razas);
        Iterator it2 = razas.iterator();

        while (it2.hasNext()) {
            System.out.println(it2.next());
        }

        System.out.println(
                "End");
    }
}
