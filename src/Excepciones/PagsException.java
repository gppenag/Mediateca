/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author gipao
 */
public class PagsException extends Exception {

    public PagsException() {
        super("El número de páginas de un libro debe ser mayor a 10 páginas para poder ser incluido en la mediateca.");
    }
    
}
