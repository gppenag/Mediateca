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
public class AutorDVDException extends Exception{

    public AutorDVDException() {
        super (".Un DVD mínimo puede tener 1 autor y máximo 5.");
    }
    
}
