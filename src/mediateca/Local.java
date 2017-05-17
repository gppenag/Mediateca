/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediateca;

import Excepciones.AutorDVDException;
import Excepciones.CaracteresException;
import Excepciones.LibroRepetidoException;
import Excepciones.PagsException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gipao
 */
public class Local {

    
    public static void principal() throws FileNotFoundException, IOException, CaracteresException, LibroRepetidoException, PagsException, AutorDVDException{
     Mediateca mediateca = new Mediateca();
        Scanner leer = new Scanner(new File("mediateca.txt"));

        while (leer.hasNext()) {

            String[] linea = leer.nextLine().split(",");

            if (linea[0].equals("Libro")) {

                String nombreL = linea[4];
                mediateca.verifTitulo(nombreL);
                if(nombreL.length()<10){
                    throw new CaracteresException();
                }
                ArrayList<Autor> autorLibro = new ArrayList<>();
                
                int numeroPg = Integer.parseInt(linea[1]);
                if(numeroPg<10){
                    throw new PagsException();
                }
                Libro libro = new Libro(
                        numeroPg,
                        Integer.parseInt(linea[3]),
                        nombreL);
                for (int i = 5; i < linea.length; i++) {
                    autorLibro.add(new Autor(linea[i]));
                }

            } else if (linea[0].equals("Cd")) {
                String genero = linea[1];
                Integer.parseInt(linea[2]);
                ArrayList<Autor> autoresCd = new ArrayList<>();
                String tituloACd = linea[3];
                mediateca.verifTitulo(tituloACd);
                for (int i = 4; i < linea.length; i++) {
                    autoresCd.add(new Autor(linea[i]));
                }

            } else if (linea[0].equals("Dvds")) {
                Integer.parseInt(linea[1]);
                String tituloDvds = linea[2];
                mediateca.verifTitulo(tituloDvds);
                ArrayList<Autor> autoresDvds = new ArrayList<>();
                
                if(linea.length<4||linea.length-3>5){
                    throw new AutorDVDException();
                }
                
                for (int i = 3; i < linea.length; i++) {
                    
                    autoresDvds.add(new Autor(linea[i]));
                }

            } else {
                String nombre = linea[0];
                String apellido = linea[1];
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        /*File f = new File("mediateca.txt");
        f.createNewFile();
        PrintStream output = new PrintStream(f);
        output.println("Libro,Titulo,Nombre,Apellido,122345,\n" +
                        "Libro,JavaLanguage,Balagu,E,41456,");
        
TipoDeSoporte cd= new Cd("dfgfsdg", 0, "sdfgdfsh");
        System.out.println(cd.getClass());
         */
       try{
           principal();
       }catch(AutorDVDException ex){
       ex.getMessage();
       } catch (IOException ex) {
            
       } catch (CaracteresException ex) {
            
       } catch (LibroRepetidoException ex) {
           
       } catch (PagsException ex) {
            
        }
      
    }

}
