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
public class DuracionDVDException extends Exception{

    public DuracionDVDException() {
        super ("La duración de un DVD mínimo debe ser de 20 minutos.");
    }
    
    
}
