/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1g10razasperros;

import java.util.ArrayList;
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
            System.out.println("Ing Otra raza?");
            if (leer.next().equalsIgnoreCase("N")) { // Confirmacion s/n
                conf = false;
            }
        } while (conf);
        
        Iterator it = razas.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

}

