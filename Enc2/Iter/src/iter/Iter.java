/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iter;

import java.util.ArrayList;
import java.util.Iterator;
import static java.util.Spliterators.iterator;

/**
 *
 * @author U
 */
public class Iter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> lista = new ArrayList();
        lista.add("A");
        lista.add("B");
        lista.add("C");
        lista.remove("B");
        //Creamos el Iterator para recorrer la lista
        Iterator it = lista.iterator();
        System.out.println("Elementos de la lista: ");
        
        //Armamos un bucle while, siempre que el hasnext() devuelva true.
        while (it.hasNext()) {            
            System.out.println(it.next()+" ");
            System.out.println("Bool = " + it.hasNext());
        }
        System.out.println(" ");
    }
    
}
