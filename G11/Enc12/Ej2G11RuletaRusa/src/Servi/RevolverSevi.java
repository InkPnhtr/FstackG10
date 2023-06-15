/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servi;

import Enti.RevolverDeAgua;

/**
 *
 * @author U
 */
public class RevolverSevi {
    /*Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
*/
    RevolverDeAgua revolAgua = new RevolverDeAgua();
    public void llenarRevolver(){
        revolAgua.setPosActu((int) (Math.random() * 6));
        System.out.println("PosActu= "+ revolAgua.getPosActu());
        revolAgua.setPosAgua((int) (Math.random() * 6));
        System.out.println("PosAgua= "+ revolAgua.getPosAgua());

    }
    public boolean mojar(){
        toString();
        return revolAgua.getPosActu() == revolAgua.getPosAgua();
    }
    
    public void siguienteChorro(){
        int a=revolAgua.getPosActu();
        do{
            a++;
            revolAgua.setPosActu(a);
            mostrarPosRevol();
        }while (a<=5);
        a=0;
        revolAgua.setPosActu(a);
        mostrarPosRevol();
                
    }
    
    public void mostrarPosRevol(){
        System.out.println("PosActu= "+ revolAgua.getPosActu());
        System.out.println("PosAgua= "+ revolAgua.getPosAgua());
    }

    @Override
    public String toString() {
        return "RevolverSevi{" + "revolAgua=" + revolAgua + '}';
    }
    
    
    
}
