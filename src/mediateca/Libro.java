/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediateca;

import java.util.Date;

/**
 *
 * @author gipao
 */
public class Libro extends TipoDeSoporte{
    private int numPag;
    private int ISBN;

    public Libro(int numPag, int ISBN, String titulo) {
        super(titulo);
        this.numPag = numPag;
        this.ISBN = ISBN;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Libro{" + "numPag=" + numPag + ", ISBN=" + ISBN + '}'+super.toString();
    }
    
    
}
