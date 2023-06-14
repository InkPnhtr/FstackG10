/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enti;

/**
 *
 * @author U
 */
public class RevolverDeAgua {
//    esta clase posee los siguientes atributos: posición actual (posición 
//del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del 
//tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
    private int posActu;
    private int posAgua;

    public RevolverDeAgua() {
    }

    public int getPosActu() {
        return posActu;
    }

    public void setPosActu(int posActu) {
        this.posActu = posActu;
    }

    public int getPosAgua() {
        return posAgua;
    }

    public void setPosAgua(int posAgua) {
        this.posAgua = posAgua;
    }
    
    
    
}
