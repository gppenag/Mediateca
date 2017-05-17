/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediateca;

import java.util.ArrayList;

/**
 *
 * @author gipao
 */
public class Cd extends TipoDeSoporte {
    private String genero;
    private int minDur;

    public Cd(String genero, int minDur, String titulo) {
        super(titulo);
        this.genero = genero;
        this.minDur = minDur;
    }
   
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getMinDur() {
        return minDur;
    }

    public void setMinDur(int minDur) {
        this.minDur = minDur;
    }

    @Override
    public String toString() {
        return "Cd{" + "genero=" + genero + ", minDur=" + minDur + '}'+super.toString();
    }

    
    
    
 
}
