/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serv;

import Entid.Electrodomestico;
import java.util.Scanner;

/**
 *
 * @author U
 */
public class ElectroServic {

    final double precioBase = 1000.2;
    Electrodomestico elec1 = new Electrodomestico();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ElectroServic() {
    }

    public void crearElectrodomestico() {
        System.out.print("Ing Peso: ");
        elec1.setPeso(leer.nextInt());
        System.out.print("Ing Color: ");
        elec1.setColor(leer.next());
        System.out.print("Ing Cons. Energ.(A-F): ");
        elec1.setConsumoEnergetico(leer.next().charAt(0));
        System.out.println("Ing Precio: = 1000");
        //elec1.setPrecio(precioFinal(elec1.getPeso()));

        //System.out.println("Precio Final Prueba = " + precioFinal(elec1.getPeso()));
        elec1.comprobarColor(elec1.getColor());

        System.out.println("color electrodomestico = " + elec1.getColor());
    }

    /*• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:
    LETRA PRECIO
A $1000
B $800
C $600
D $500
E $300
F $100

PESO PRECIO
Entre 1 y 19 kg $100
Entre 20 y 49 kg $500
Entre 50 y 79 kg $800
Mayor que 80 kg $1000
     */
    protected double precioFinal(int peso) {

        if (peso > 0 && peso < 20) {
            System.out.println("peso = " + peso);
            System.out.println("Recargo x peso < 20Kg $100");
            return precioBase + 100 + elec1.comprobarConsumoEnergetico(elec1.getConsumoEnergetico());
        } else if (peso < 50) {
            System.out.println("peso = " + peso);
            System.out.println("Recargo x peso < 50Kg $500");
            return precioBase + 500 + elec1.comprobarConsumoEnergetico(elec1.getConsumoEnergetico());
        } else if (peso < 80) {
            System.out.println("peso = " + peso);
            System.out.println("Recargo x peso < 80Kg $800");
            return precioBase + 800 + elec1.comprobarConsumoEnergetico(elec1.getConsumoEnergetico());
        }
        System.out.println("peso = " + peso);
        System.out.println("Recargo x peso > 80Kg $1000");
        return precioBase + 1000 + elec1.comprobarConsumoEnergetico(elec1.getConsumoEnergetico());
    }

}
