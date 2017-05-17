/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediateca;

import java.util.GregorianCalendar;

/**
 *
 * @author gipao
 */
public class Persona {

    private String nombre;
    private String apellido;
    private String direccion;
    private int prestamos = 0;
    private TipoDeSoporte[] articulosP;

    public Persona(String nombre, String apellido, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.articulosP = new TipoDeSoporte[3];
    }

    public TipoDeSoporte[] getArticulosP() {
        return articulosP;
    }

    public boolean comprobarFechas(){
        GregorianCalendar gc= new GregorianCalendar();
        
        for(int i=0;i<prestamos;i++){
            GregorianCalendar gc2=new GregorianCalendar();
            gc2.setGregorianChange(articulosP[i].getFechaP());
            gc2.add(3,3);
            
            if(gc.compareTo(gc2)>0){
            
            
            }
        
        }
        return false;
    }
    
    
    public void agregarArticulo(TipoDeSoporte articuloP) {
        if(comprobarFechas())
        
        this.articulosP[prestamos++] = articuloP;
    }

    public void quitarArticulo(TipoDeSoporte articuloP) {
        this.articulosP[prestamos--] = articuloP;
    }

    public int getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(int prestamos) {
        this.prestamos = prestamos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + '}';
    }

}
