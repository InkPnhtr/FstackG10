/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videnc1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author U
 */
public class VidEnc1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//        String[] nombresArray = new String[5];
//        for (int i = 0; i < nombresArray.length; i++) {
//            nombresArray[i] = "Pepito " + (i + 1);
//        }
//        for (String var : nombresArray) {
//            System.out.println(var);
//        }
        //Collections
        ArrayList<String> nombresArrayList = new ArrayList();
//        nombresArrayList.clear();
        nombresArrayList.add("Chiquito");
        nombresArrayList.add("Chiquito");
        nombresArrayList.add("Chiquito");
        nombresArrayList.add("Chiquito");
        System.out.println(nombresArrayList.size());
        nombresArrayList.remove("Chiquito");
        System.out.println(nombresArrayList.size());
        //System.out.println(Integer.MAX_VALUE);
        
        for (String x : nombresArrayList) {
            System.out.println("NombreArrayList = " + x);
        }
        Iterator t = nombresArrayList.iterator();
        //while (t.hasNext()){
            System.out.println("Nombre = " + t.toString());
            System.out.println("Nombre = " + t.next());
            System.out.println("Nombre = " + t.hasNext());
            System.out.println("Nombre = " + t.hasNext());
            System.out.println("Nombre = " + t.hasNext());
        //}
        

    }
}
