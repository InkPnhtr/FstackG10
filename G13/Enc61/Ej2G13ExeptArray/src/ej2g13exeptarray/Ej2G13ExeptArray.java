/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2g13exeptarray;

import Entid.ArrClass;
import java.util.ArrayList;

/**
 *
 * @author U
 */
public class Ej2G13ExeptArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrClass arr = new ArrClass();

        ArrayList<Integer> num = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            num.add(i);
        }

        arr.setNumeros(num);
        arr.getNumeros().add(88);
        arr.getNumeros().set(1, 22);
        try {

            for (int i = 0; i < 7; i++) {

                //arr.getNumeros().remove(integer);
                System.out.println(arr.getNumeros().get(i));

            }
        } catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage()+ "EXPLOTO EL ARRAY");
            System.out.println(e.getCause());
            System.out.println(e.getStackTrace());
            System.out.println(e.fillInStackTrace());
        }
        }

    }
