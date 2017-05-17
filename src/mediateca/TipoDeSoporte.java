/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediateca;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author gipao
 */
public class TipoDeSoporte {

    protected String titulo;
    protected ArrayList<Autor> autores;
    protected boolean disponible;
    protected Date fechaP;
    
   

    public TipoDeSoporte(String titulo) {
        this.titulo = titulo;
        this.autores = new ArrayList<>();
    }

    public Date getFechaP() {
        return fechaP;
    }

    public void setFechaP(Date fechaP) {
        this.fechaP = fechaP;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<Autor> autores) {
        this.autores = autores;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "TipoDeSoporte{" + "titulo=" + titulo + '}';
    }

}
