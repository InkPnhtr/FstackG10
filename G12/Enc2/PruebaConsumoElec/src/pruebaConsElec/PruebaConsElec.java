/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaConsElec;

/**
 *
 * @author U
 */
public class PruebaConsElec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean e=false;
        String x ="A";
        String a="abcdefABCDEF";
        for (int i = 0; i < a.length(); i++) {
            System.out.println(a.charAt(i));
            if ((a.charAt(i)) == (x.charAt(0))){
                System.out.println("true");
                e=true;
            }
            
        }
        System.out.println("e= "+ e);
    }
    
}
