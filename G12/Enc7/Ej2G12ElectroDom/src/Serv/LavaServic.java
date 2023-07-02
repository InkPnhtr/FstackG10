/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serv;

import Entid.Lavadora;

/**
 *
 * @author U
 */
public class LavaServic extends ElectroServic {

    /*Los métodos que se implementara serán:
• Método get y set del atributo carga.
• Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
el atributo propio de la lavadora.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.*/
    Lavadora lav1 = new Lavadora();

    public void crearLavadora() {
        
        System.out.println("LAVADORA:");
        crearElectrodomestico();
        lav1.setPeso(elec1.getPeso());
        System.out.print("Ing carga: (r>30Kg)");
        lav1.setCarga(leer.nextInt());
        
        
        System.out.println("El precio de la Lav = "+ precioFinal(lav1.getPeso()));
       

    }

    
    
    
//    @Override
//    public double precioFinal(int peso) {
//        super.precioFinal(peso);
//
//        if (lav1.getCarga() > 30) {
//            lav1.setPrecio(lav1.getPrecio()+500);
//        }
//        return lav1.getPrecio();
//    }

    @Override
    protected double precioFinal(int peso) {
        if (lav1.getCarga() > 30) {
            System.out.println("Recargo x CargaLav > 30Kg: $ " + 500);
            return (super.precioFinal(peso) + 500);
        }
        return super.precioFinal(peso); //To change body of generated methods, choose Tools | Templates.
    }

}
