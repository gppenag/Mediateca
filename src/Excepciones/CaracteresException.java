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
public class CaracteresException extends Exception {
    
    public CaracteresException() {
        super("Los títulos de las diferentes soportes no deben superara los 100 caracteres");
    }
}
