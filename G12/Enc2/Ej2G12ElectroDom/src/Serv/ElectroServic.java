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

    
    
    final float precioBase = 1000;
    Electrodomestico elec1 = new Electrodomestico();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ElectroServic() {
    }
    
    protected void crearElectrodomestico(){
        System.out.println("Ing Precio: = 1000");
        elec1.setPrecio(precioBase);
        System.out.print("Ing Color: ");
        elec1.setColor(leer.next());
        System.out.print("Ing Cons. Energ.: ");
        elec1.setConsumoEnergetico(leer.next().charAt(0));
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
protected float precioFinal(float preci){
    
    }
}
