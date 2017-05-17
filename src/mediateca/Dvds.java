/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediateca;

/**
 *
 * @author gipao
 */
public class Dvds extends TipoDeSoporte {
   private int minDuración;

    public Dvds(int minDuración, String titulo) {
        super(titulo);
        this.minDuración = minDuración;
    }
    
    public int getMinDuración() {
        return minDuración;
    }

    public void setMinDuración(int minDuración) {
        this.minDuración = minDuración;
    }

    @Override
    public String toString() {
        return "Dvds{" + "minDuracion=" + minDuración + '}';
    }


   
    
   
}
