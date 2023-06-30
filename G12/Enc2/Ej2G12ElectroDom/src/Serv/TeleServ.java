/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serv;

import Entid.Tele;

/**
 *
 * @author U
 */
public class TeleServ extends ElectroServic {

    /*Se debe crear también una subclase llamada Televisor con los siguientes atributos:

    • Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.
*/
    Tele t1 = new Tele(0);

    public void crearTelevisor() {
        System.out.println("TELE: ");
        crearElectrodomestico();
        System.out.print("Ing Resolucion en pulg. : ");
        t1.setResolución(leer.nextInt());
        System.out.print("Tiene Sint. TDT (s/n) ? : ");
        if (leer.next().equalsIgnoreCase("s")) {
            t1.setSintTDT(true);
        }
        System.out.println("Peso = "+ t1.getPeso());
        System.out.println("El precio de la Tele1 = "+ precioFinal(t1.getPeso()));
        
        
    }

    @Override
    protected double precioFinal(int peso) {
        if (t1.getResolución() > 40) {
            System.out.println("Recargo x Resolu > 40 = 30%: $ " + (super.precioFinal(peso) * 0.3));
            return (super.precioFinal(peso) * 1.3); //To change body of generated methods, choose Tools | Templates.
        }
        if (t1.isSintTDT()) {
            System.out.println("Recargo x SintTDT: $ " + 500);
            return (super.precioFinal(peso) + 500); //To change body of generated methods, choose Tools | Templates.

        }
        return (super.precioFinal(peso)); //To change body of generated methods, choose Tools | Templates.
    }

//• Método precioFinal(): este método será heredado y se le sumará la siguiente
//funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
//incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
//$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
//también deben afectar al precio.
}
