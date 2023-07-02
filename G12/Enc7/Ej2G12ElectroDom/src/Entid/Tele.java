/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entid;

/**
 *
 * @author U
 */
public class Tele extends Electrodomestico{
    /*Se debe crear también una subclase llamada Televisor con los siguientes atributos:
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de los atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.*/
    
    private int resolución;
    
    private boolean sintTDT = false;

    public Tele(int resolución) {
        this.resolución = resolución;
    }

    public Tele(int resolución, double precio, int peso, String color, char consumoEnergetico) {
        super(precio, peso, color, consumoEnergetico);
        this.resolución = resolución;
    }

    public int getResolución() {
        return resolución;
    }

    public void setResolución(int resolución) {
        this.resolución = resolución;
    }

    public boolean isSintTDT() {
        return sintTDT;
    }

    public void setSintTDT(boolean sintTDT) {
        this.sintTDT = sintTDT;
    }

    @Override
    public String toString() {
        return "Tele{" + "resoluci\u00f3n=" + resolución + ", sintTDT=" + sintTDT + '}';
    }
    
    
    
    
    
    
    
    
    
    
    
}
